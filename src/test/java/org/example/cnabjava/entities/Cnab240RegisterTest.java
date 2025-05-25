package org.example.cnabjava.entities;

import org.example.cnabjava.enums.Cnab240RegisterType;
import org.example.cnabjava.enums.CnabFileStatus;
import org.example.cnabjava.enums.CnabType;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class Cnab240RegisterTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var bankCode = "any_bank_code";
    final var agencyCode = "any_agency_code";
    final var accountNumber = "any_account_number";
    final var accountingDate = "any_accounting_date";
    final var releaseDate = "any_release_date";
    final var amount = "any_amount";
    final var type = Cnab240RegisterType.DEBIT;
    final var category = "any_category";
    final var historicCode = "any_historic_code";
    final var historicDescription = "any_historic_description";
    final var complement = "any_complement";
    final var now = Instant.now();
    final var cnabHeader = this.createCnabHeader();

    final var register = new Cnab240Register(
        id,
        bankCode,
        agencyCode,
        accountNumber,
        accountingDate,
        releaseDate,
        amount,
        type,
        category,
        historicCode,
        historicDescription,
        complement,
        now,
        now,
        cnabHeader
    );

    assertThat(register.getId()).isEqualTo(id);
    assertThat(register.getBankCode()).isEqualTo(bankCode);
    assertThat(register.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(register.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(register.getAccountingDate()).isEqualTo(accountingDate);
    assertThat(register.getReleaseDate()).isEqualTo(releaseDate);
    assertThat(register.getAmount()).isEqualTo(amount);
    assertThat(register.getType()).isEqualTo(type);
    assertThat(register.getCategory()).isEqualTo(category);
    assertThat(register.getHistoricCode()).isEqualTo(historicCode);
    assertThat(register.getHistoricDescription()).isEqualTo(historicDescription);
    assertThat(register.getComplement()).isEqualTo(complement);
    assertThat(register.getCreatedAt()).isEqualTo(now);
    assertThat(register.getUpdatedAt()).isEqualTo(now);
    assertThat(register.getCnabHeader()).isEqualTo(cnabHeader);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var bankCode = "other_bank_code";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var accountingDate = "other_accounting_date";
    final var releaseDate = "other_release_date";
    final var amount = "other_amount";
    final var type = Cnab240RegisterType.DEBIT;
    final var category = "other_category";
    final var historicCode = "other_historic_code";
    final var historicDescription = "other_historic_description";
    final var complement = "other_complement";
    final var now = Instant.now();
    final var cnabHeader = this.createCnabHeader();

    final var register = new Cnab240Register();
    register.setId(id);
    register.setBankCode(bankCode);
    register.setAgencyCode(agencyCode);
    register.setAccountNumber(accountNumber);
    register.setAccountingDate(accountingDate);
    register.setReleaseDate(releaseDate);
    register.setAmount(amount);
    register.setType(type);
    register.setCategory(category);
    register.setHistoricCode(historicCode);
    register.setHistoricDescription(historicDescription);
    register.setComplement(complement);
    register.setCreatedAt(now);
    register.setUpdatedAt(now);
    register.setCnabHeader(cnabHeader);

    assertThat(register.getId()).isEqualTo(id);
    assertThat(register.getBankCode()).isEqualTo(bankCode);
    assertThat(register.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(register.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(register.getAccountingDate()).isEqualTo(accountingDate);
    assertThat(register.getReleaseDate()).isEqualTo(releaseDate);
    assertThat(register.getAmount()).isEqualTo(amount);
    assertThat(register.getType()).isEqualTo(type);
    assertThat(register.getCategory()).isEqualTo(category);
    assertThat(register.getHistoricCode()).isEqualTo(historicCode);
    assertThat(register.getHistoricDescription()).isEqualTo(historicDescription);
    assertThat(register.getComplement()).isEqualTo(complement);
    assertThat(register.getCreatedAt()).isEqualTo(now);
    assertThat(register.getUpdatedAt()).isEqualTo(now);
    assertThat(register.getCnabHeader()).isEqualTo(cnabHeader);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var bankCode = "any_bank_code";
    final var agencyCode = "any_agency_code";
    final var accountNumber = "any_account_number";
    final var accountingDate = "any_accounting_date";
    final var releaseDate = "any_release_date";
    final var amount = "any_amount";
    final var type = Cnab240RegisterType.DEBIT;
    final var category = "any_category";
    final var historicCode = "any_historic_code";
    final var historicDescription = "any_historic_description";
    final var complement = "any_complement";
    final var now = Instant.now();
    final var cnabHeader = this.createCnabHeader();

    final var register = new Cnab240Register(
        id,
        bankCode,
        agencyCode,
        accountNumber,
        accountingDate,
        releaseDate,
        amount,
        type,
        category,
        historicCode,
        historicDescription,
        complement,
        now,
        now,
        cnabHeader
    );

    assertThat(register.toString()).hasToString(
        "CnabRegister{" +
            "id=" + id +
            ", bankCode='" + bankCode + '\'' +
            ", agencyCode='" + agencyCode + '\'' +
            ", accountNumber='" + accountNumber + '\'' +
            ", accountingDate='" + accountingDate + '\'' +
            ", releaseDate='" + releaseDate + '\'' +
            ", amount='" + amount + '\'' +
            ", type=" + type +
            ", category='" + category + '\'' +
            ", historicCode='" + historicCode + '\'' +
            ", historicDescription='" + historicDescription + '\'' +
            ", complement='" + complement + '\'' +
            ", createdAt=" + now +
            ", updatedAt=" + now +
            ", cnabHeader=" + cnabHeader +
            '}'
    );
  }

  private Cnab240Header createCnabHeader() {
    final var now = Instant.now();
    return new Cnab240Header(
        UUID.randomUUID(),
        "any_cnpj",
        "any_bank_code",
        "any_agency_code",
        "any_account_number",
        "any_company_name",
        "any_date",
        "any_time",
        1,
        now,
        now,
        this.createCnabFile()
    );
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
