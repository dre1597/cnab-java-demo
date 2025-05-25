package org.example.cnabjava.services;

import org.example.cnabjava.entities.CnabFile;
import org.example.cnabjava.enums.CnabFileStatus;
import org.example.cnabjava.enums.CnabType;
import org.example.cnabjava.repositories.*;
import org.example.cnabjava.services.helpers.header.CnabConstants;
import org.example.cnabjava.services.helpers.header.CnabExtractHeaderData;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

@Service
public class CnabService {
  private final CnabFileRepository cnabFileRepository;
  private final Cnab240HeaderRepository cnab240HeaderRepository;
  private final Cnab750HeaderRepository cnab750HeaderRepository;
  private final Cnab240RegisterRepository cnab240RegisterRepository;
  private final Cnab750RegisterRepository cnab750RegisterRepository;
  private final int CNAB240_LENGTH = 240;
  private final int CNAB750_LENGTH = 750;

  public CnabService(
      final CnabFileRepository cnabFileRepository,
      final Cnab240HeaderRepository cnab240HeaderRepository,
      final Cnab750HeaderRepository cnab750HeaderRepository,
      final Cnab240RegisterRepository cnab240RegisterRepository,
      final Cnab750RegisterRepository cnab750RegisterRepository
  ) {
    this.cnabFileRepository = Objects.requireNonNull(cnabFileRepository);
    this.cnab240HeaderRepository = Objects.requireNonNull(cnab240HeaderRepository);
    this.cnab750HeaderRepository = Objects.requireNonNull(cnab750HeaderRepository);
    this.cnab240RegisterRepository = Objects.requireNonNull(cnab240RegisterRepository);
    this.cnab750RegisterRepository = Objects.requireNonNull(cnab750RegisterRepository);
  }

  public void create(final MultipartFile file) {
    try (final var reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
      final var header = reader.readLine();
      final var cnabType = this.getCnabType(header);
      final var registers = new ArrayList<String>();

      String line;
      while ((line = reader.readLine()) != null) {
        registers.add(line);
      }

      final var headerInfo = this.processHeader(cnabType, header);
      System.out.println(headerInfo);
      for (final var register : registers) {
        this.processRegister(cnabType, register);
      }

      this.saveFile(file.getOriginalFilename(), CnabFileStatus.SUCCESS, cnabType);
    } catch (Exception e) {
      System.err.println("Error processing file: " + e.getMessage());
      e.printStackTrace();
    }
  }

  private CnabType getCnabType(final String header) {
    if (header.length() == CNAB240_LENGTH || header.length() == CNAB240_LENGTH + 1) {
      return CnabType.CNAB240;
    } else if (header.length() == CNAB750_LENGTH || header.length() == CNAB750_LENGTH + 1) {
      return CnabType.CNAB750;
    } else {
      return CnabType.UNKNOWN;
    }
  }

  private void saveFile(final String fileName, final CnabFileStatus status, final CnabType type) {
    this.cnabFileRepository.save(new CnabFile(fileName, status, type));
  }

  private Map<String, Object> processHeader(final CnabType cnabType, final String header) {
    if (cnabType == CnabType.CNAB240) {
      final var extractor = new CnabExtractHeaderData(header);
      return extractor.getHeaderInfo(CnabConstants.CNAB_240_HEADER_FIELDS);
    } else if (cnabType == CnabType.CNAB750) {
      final var extractor = new CnabExtractHeaderData(header);
      return extractor.getHeaderInfo(CnabConstants.CNAB_750_HEADER_FIELDS);
    }
    return Collections.emptyMap();
  }

  private void processRegister(final CnabType cnabType, final String register) {
    if (cnabType == CnabType.CNAB240) {
      // TODO: read positions
    } else if (cnabType == CnabType.CNAB750) {
      // TODO: read positions
    }
  }
}
