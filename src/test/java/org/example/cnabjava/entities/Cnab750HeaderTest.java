package org.example.cnabjava.entities;

import org.example.cnabjava.enums.CnabFileStatus;
import org.example.cnabjava.enums.CnabType;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Cnab750HeaderTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var cnpj = "any_cnpj";
    final var agencyCode = "any_agency_code";
    final var accountNumber = "any_account_number";
    final var companyName = "any_company_name";
    final var numberOfRegisters = 1;
    final var now = Instant.now();
    final var cnabFile = this.createCnabFile();

    final var header = new Cnab750Header(
        id,
        cnpj,
        agencyCode,
        accountNumber,
        companyName,
        numberOfRegisters,
        now,
        now,
        cnabFile
    );

    assertEquals(id, header.getId());
    assertEquals(cnpj, header.getCnpj());
    assertEquals(agencyCode, header.getAgencyCode());
    assertEquals(accountNumber, header.getAccountNumber());
    assertEquals(companyName, header.getCompanyName());
    assertEquals(numberOfRegisters, header.getNumberOfRegisters());
    assertEquals(now, header.getCreatedAt());
    assertEquals(now, header.getUpdatedAt());
    assertEquals(cnabFile, header.getCnabFile());
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var cnpj = "other_cnpj";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var companyName = "other_company_name";
    final var numberOfRegisters = 2;
    final var now = Instant.now();
    final var cnabFile = this.createCnabFile();

    final var header = new Cnab750Header();
    header.setId(id);
    header.setCnpj(cnpj);
    header.setAgencyCode(agencyCode);
    header.setAccountNumber(accountNumber);
    header.setCompanyName(companyName);
    header.setNumberOfRegisters(numberOfRegisters);
    header.setCreatedAt(now);
    header.setUpdatedAt(now);
    header.setCnabFile(cnabFile);

    assertEquals(id, header.getId());
    assertEquals(cnpj, header.getCnpj());
    assertEquals(agencyCode, header.getAgencyCode());
    assertEquals(accountNumber, header.getAccountNumber());
    assertEquals(companyName, header.getCompanyName());
    assertEquals(numberOfRegisters, header.getNumberOfRegisters());
    assertEquals(now, header.getCreatedAt());
    assertEquals(now, header.getUpdatedAt());
    assertEquals(cnabFile, header.getCnabFile());
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var cnpj = "other_cnpj";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var companyName = "other_company_name";
    final var numberOfRegisters = 2;
    final var now = Instant.now();
    final var cnabFile = this.createCnabFile();

    final var header = new Cnab750Header(
        id,
        cnpj,
        agencyCode,
        accountNumber,
        companyName,
        numberOfRegisters,
        now,
        now,
        cnabFile
    );

    assertEquals("Cnab750Header{" +
        "id=" + id +
        ", cnpj='" + cnpj + '\'' +
        ", agencyCode='" + agencyCode + '\'' +
        ", accountNumber='" + accountNumber + '\'' +
        ", companyName='" + companyName + '\'' +
        ", numberOfRegisters=" + numberOfRegisters +
        ", createdAt=" + now +
        ", updatedAt=" + now +
        ", cnabFile=" + cnabFile +
        '}', header.toString());
  }

  private CnabFile createCnabFile() {
    final var now = Instant.now();
    return new CnabFile(
        UUID.randomUUID(),
        "any_file_name",
        CnabFileStatus.SUCCESS,
        CnabType.CNAB750,
        null,
        now,
        now
    );
  }
}
