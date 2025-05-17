package org.example.cnabjava.controllers;

import org.example.cnabjava.services.CnabService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

@RestController
@RequestMapping("/cnabs")
public class CnabController {
  private final CnabService cnabService;

  public CnabController(final CnabService cnabService) {
    this.cnabService = Objects.requireNonNull(cnabService);
  }

  @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  public void create(@RequestPart("file") MultipartFile file) {
    final var fileName = file.getOriginalFilename();
    final var size = file.getSize();

    System.out.println(fileName);
    System.out.println(size);
  }
}
