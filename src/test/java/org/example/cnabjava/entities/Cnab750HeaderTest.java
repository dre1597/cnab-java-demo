package org.example.cnabjava.entities;

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
      final var sequentialNumber = "any_sequential_number";
      final var version = "any_version";
      final var numberOfRegisters = 1;
      final var now = Instant.now();

      final var header = new Cnab750Header(
          id,
          cnpj,
          agencyCode,
          accountNumber,
          companyName,
          sequentialNumber,
          version,
          numberOfRegisters,
          now,
          now
      );

      assertEquals(id, header.getId());
      assertEquals(cnpj, header.getCnpj());
      assertEquals(agencyCode, header.getAgencyCode());
      assertEquals(accountNumber, header.getAccountNumber());
      assertEquals(companyName, header.getCompanyName());
      assertEquals(sequentialNumber, header.getSequentialNumber());
      assertEquals(version, header.getVersion());
      assertEquals(numberOfRegisters, header.getNumberOfRegisters());
      assertEquals(now, header.getCreatedAt());
      assertEquals(now, header.getUpdatedAt());
  }

  @Test
  void shouldSetAndGetAllFields() {
      final var id = UUID.randomUUID();
      final var cnpj = "other_cnpj";
      final var agencyCode = "other_agency_code";
      final var accountNumber = "other_account_number";
      final var companyName = "other_company_name";
      final var sequentialNumber = "other_sequential_number";
      final var version = "other_version";
      final var numberOfRegisters = 2;
      final var now = Instant.now();

      final var header = new Cnab750Header();
      header.setId(id);
      header.setCnpj(cnpj);
      header.setAgencyCode(agencyCode);
      header.setAccountNumber(accountNumber);
      header.setCompanyName(companyName);
      header.setSequentialNumber(sequentialNumber);
      header.setVersion(version);
      header.setNumberOfRegisters(numberOfRegisters);
      header.setCreatedAt(now);
      header.setUpdatedAt(now);

      assertEquals(id, header.getId());
      assertEquals(cnpj, header.getCnpj());
      assertEquals(agencyCode, header.getAgencyCode());
      assertEquals(accountNumber, header.getAccountNumber());
      assertEquals(companyName, header.getCompanyName());
      assertEquals(sequentialNumber, header.getSequentialNumber());
      assertEquals(version, header.getVersion());
      assertEquals(numberOfRegisters, header.getNumberOfRegisters());
      assertEquals(now, header.getCreatedAt());
      assertEquals(now, header.getUpdatedAt());
  }

  @Test
  void shouldGenerateToString() {
      final var id = UUID.randomUUID();
      final var cnpj = "other_cnpj";
      final var agencyCode = "other_agency_code";
      final var accountNumber = "other_account_number";
      final var companyName = "other_company_name";
      final var sequentialNumber = "other_sequential_number";
      final var version = "other_version";
      final var numberOfRegisters = 2;
      final var now = Instant.now();

      final var header = new Cnab750Header(
          id,
          cnpj,
          agencyCode,
          accountNumber,
          companyName,
          sequentialNumber,
          version,
          numberOfRegisters,
          now,
          now
      );

      assertEquals("Cnab750Header{" +
          "id=" + id +
          ", cnpj='" + cnpj + '\'' +
          ", agencyCode='" + agencyCode + '\'' +
          ", accountNumber='" + accountNumber + '\'' +
          ", companyName='" + companyName + '\'' +
          ", sequentialNumber='" + sequentialNumber + '\'' +
          ", version='" + version + '\'' +
          ", numberOfRegisters=" + numberOfRegisters +
          ", createdAt=" + now +
          ", updatedAt=" + now +
          '}', header.toString());
  }
}
