package org.example.cnabjava.entities;

import org.example.cnabjava.enums.CnabFileStatus;
import org.example.cnabjava.enums.CnabType;
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
    final var companyName = "any_company_name";
    final var date = "2025-01-01";
    final var time = "00:00:00";
    final var numberOfRegisters = 1;
    final var now = Instant.now();
    final var cnabFile = this.createCnabFile();

    final var header = new Cnab240Header(
        id,
        cnpj,
        bankCode,
        agencyCode,
        accountNumber,
        companyName,
        date,
        time,
        numberOfRegisters,
        now,
        now,
        cnabFile
    );

    assertThat(header.getId()).isEqualTo(id);
    assertThat(header.getCnpj()).isEqualTo(cnpj);
    assertThat(header.getBankCode()).isEqualTo(bankCode);
    assertThat(header.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(header.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(header.getCompanyName()).isEqualTo(companyName);
    assertThat(header.getDate()).isEqualTo(date);
    assertThat(header.getTime()).isEqualTo(time);
    assertThat(header.getNumberOfRegisters()).isEqualTo(numberOfRegisters);
    assertThat(header.getCreatedAt()).isEqualTo(now);
    assertThat(header.getUpdatedAt()).isEqualTo(now);
    assertThat(header.getCnabFile()).isEqualTo(cnabFile);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var cnpj = "other_cnpj";
    final var bankCode = "other_bank_code";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var companyName = "other_company_name";
    final var date = "2025-01-01";
    final var time = "00:00:00";
    final var numberOfRegisters = 2;
    final var now = Instant.now();
    final var cnabFile = this.createCnabFile();

    final var header = new Cnab240Header();
    header.setId(id);
    header.setCnpj(cnpj);
    header.setBankCode(bankCode);
    header.setAgencyCode(agencyCode);
    header.setAccountNumber(accountNumber);
    header.setCompanyName(companyName);
    header.setDate(date);
    header.setTime(time);
    header.setNumberOfRegisters(numberOfRegisters);
    header.setCreatedAt(now);
    header.setUpdatedAt(now);
    header.setCnabFile(cnabFile);

    assertThat(header.getId()).isEqualTo(id);
    assertThat(header.getCnpj()).isEqualTo(cnpj);
    assertThat(header.getBankCode()).isEqualTo(bankCode);
    assertThat(header.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(header.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(header.getCompanyName()).isEqualTo(companyName);
    assertThat(header.getDate()).isEqualTo(date);
    assertThat(header.getTime()).isEqualTo(time);
    assertThat(header.getNumberOfRegisters()).isEqualTo(numberOfRegisters);
    assertThat(header.getCreatedAt()).isEqualTo(now);
    assertThat(header.getUpdatedAt()).isEqualTo(now);
    assertThat(header.getCnabFile()).isEqualTo(cnabFile);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var cnpj = "other_cnpj";
    final var bankCode = "other_bank_code";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var companyName = "other_company_name";
    final var date = "2025-01-01";
    final var time = "00:00:00";
    final var numberOfRegisters = 2;
    final var now = Instant.now();
    final var cnabFile = this.createCnabFile();

    final var header = new Cnab240Header(
        id,
        cnpj,
        bankCode,
        agencyCode,
        accountNumber,
        companyName,
        date,
        time,
        numberOfRegisters,
        now,
        now,
        cnabFile
    );

    assertThat(header.toString()).hasToString("CnabHeader{" +
        "id=" + id +
        ", cnpj='" + cnpj + '\'' +
        ", bankCode='" + bankCode + '\'' +
        ", agencyCode='" + agencyCode + '\'' +
        ", accountNumber='" + accountNumber + '\'' +
        ", companyName='" + companyName + '\'' +
        ", date='" + date + '\'' +
        ", time='" + time + '\'' +
        ", numberOfRegisters=" + numberOfRegisters +
        ", createdAt=" + now +
        ", updatedAt=" + now +
        ", cnabFile=" + cnabFile +
        '}');
  }

  private CnabFile createCnabFile() {
    final var now = Instant.now();
    return new CnabFile(
        UUID.randomUUID(),
        "any_file_name",
        CnabFileStatus.SUCCESS,
        CnabType.CNAB240,
        null,
        now,
        now
    );
  }
}
