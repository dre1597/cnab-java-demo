package org.example.cnabjava.entities;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class Cnab240HeaderTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var cnpj = "any_cnpj";
    final var bankCode = "any_bank_code";
    final var agencyCode = "any_agency_code";
    final var accountNumber = "any_account_number";
    final var accountDigit = "any_account_digit";
    final var agencyDigit = "any_agency_digit";
    final var digit = "any_digit";
    final var companyName = "any_company_name";
    final var date = "2025-01-01";
    final var time = "00:00:00";
    final var sequentialNumber = "any_sequential_number";
    final var version = "any_version";
    final var numberOfRegisters = 1;
    final var now = Instant.now();

    final var header = new Cnab240Header(
        id,
        cnpj,
        bankCode,
        agencyCode,
        agencyDigit,
        accountNumber,
        accountDigit,
        digit,
        companyName,
        date,
        time,
        sequentialNumber,
        version,
        numberOfRegisters,
        now,
        now
    );

    assertThat(header.getId()).isEqualTo(id);
    assertThat(header.getCnpj()).isEqualTo(cnpj);
    assertThat(header.getBankCode()).isEqualTo(bankCode);
    assertThat(header.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(header.getAgencyDigit()).isEqualTo(agencyDigit);
    assertThat(header.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(header.getAccountDigit()).isEqualTo(accountDigit);
    assertThat(header.getDigit()).isEqualTo(digit);
    assertThat(header.getCompanyName()).isEqualTo(companyName);
    assertThat(header.getDate()).isEqualTo(date);
    assertThat(header.getTime()).isEqualTo(time);
    assertThat(header.getSequentialNumber()).isEqualTo(sequentialNumber);
    assertThat(header.getVersion()).isEqualTo(version);
    assertThat(header.getNumberOfRegisters()).isEqualTo(numberOfRegisters);
    assertThat(header.getCreatedAt()).isEqualTo(now);
    assertThat(header.getUpdatedAt()).isEqualTo(now);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var cnpj = "other_cnpj";
    final var bankCode = "other_bank_code";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var accountDigit = "other_account_digit";
    final var agencyDigit = "other_agency_digit";
    final var digit = "other_digit";
    final var companyName = "other_company_name";
    final var date = "2025-01-01";
    final var time = "00:00:00";
    final var sequentialNumber = "other_sequential_number";
    final var version = "other_version";
    final var numberOfRegisters = 2;
    final var now = Instant.now();

    final var header = new Cnab240Header();
    header.setId(id);
    header.setCnpj(cnpj);
    header.setBankCode(bankCode);
    header.setAgencyCode(agencyCode);
    header.setAccountNumber(accountNumber);
    header.setAccountDigit(accountDigit);
    header.setAgencyDigit(agencyDigit);
    header.setDigit(digit);
    header.setCompanyName(companyName);
    header.setDate(date);
    header.setTime(time);
    header.setSequentialNumber(sequentialNumber);
    header.setVersion(version);
    header.setNumberOfRegisters(numberOfRegisters);
    header.setCreatedAt(now);
    header.setUpdatedAt(now);

    assertThat(header.getId()).isEqualTo(id);
    assertThat(header.getCnpj()).isEqualTo(cnpj);
    assertThat(header.getBankCode()).isEqualTo(bankCode);
    assertThat(header.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(header.getAgencyDigit()).isEqualTo(agencyDigit);
    assertThat(header.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(header.getAccountDigit()).isEqualTo(accountDigit);
    assertThat(header.getDigit()).isEqualTo(digit);
    assertThat(header.getCompanyName()).isEqualTo(companyName);
    assertThat(header.getDate()).isEqualTo(date);
    assertThat(header.getTime()).isEqualTo(time);
    assertThat(header.getSequentialNumber()).isEqualTo(sequentialNumber);
    assertThat(header.getVersion()).isEqualTo(version);
    assertThat(header.getNumberOfRegisters()).isEqualTo(numberOfRegisters);
    assertThat(header.getCreatedAt()).isEqualTo(now);
    assertThat(header.getUpdatedAt()).isEqualTo(now);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var cnpj = "other_cnpj";
    final var bankCode = "other_bank_code";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var accountDigit = "other_account_digit";
    final var agencyDigit = "other_agency_digit";
    final var digit = "other_digit";
    final var companyName = "other_company_name";
    final var date = "2025-01-01";
    final var time = "00:00:00";
    final var sequentialNumber = "other_sequential_number";
    final var version = "other_version";
    final var numberOfRegisters = 2;
    final var now = Instant.now();

    final var header = new Cnab240Header(
        id,
        cnpj,
        bankCode,
        agencyCode,
        agencyDigit,
        accountNumber,
        accountDigit,
        digit,
        companyName,
        date,
        time,
        sequentialNumber,
        version,
        numberOfRegisters,
        now,
        now
    );

    assertThat(header.toString()).hasToString("CnabHeader{" +
        "id=" + id +
        ", cnpj='" + cnpj + '\'' +
        ", bankCode='" + bankCode + '\'' +
        ", agencyCode='" + agencyCode + '\'' +
        ", agencyDigit='" + agencyDigit + '\'' +
        ", accountNumber='" + accountNumber + '\'' +
        ", accountDigit='" + accountDigit + '\'' +
        ", digit='" + digit + '\'' +
        ", companyName='" + companyName + '\'' +
        ", date='" + date + '\'' +
        ", time='" + time + '\'' +
        ", sequentialNumber='" + sequentialNumber + '\'' +
        ", version='" + version + '\'' +
        ", numberOfRegisters=" + numberOfRegisters +
        ", createdAt=" + now +
        ", updatedAt=" + now +
        '}');
  }
}
