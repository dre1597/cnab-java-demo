package org.example.cnabjava.entities;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class CnabRegisterTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var agencyCode = "any_agency_code";
    final var agencyDigit = "any_agency_digit";
    final var accountNumber = "any_account_number";
    final var accountDigit = "any_account_digit";
    final var digit = "any_digit";
    final var accountingDate = "any_accounting_date";
    final var releaseDate = "any_release_date";
    final var amount = "any_amount";
    final var type = RegisterType.DEBIT;
    final var category = "any_category";
    final var historicCode = "any_historic_code";
    final var historicDescription = "any_historic_description";
    final var complement = "any_complement";

    final var register = new CnabRegister(
        id,
        agencyCode,
        agencyDigit,
        accountNumber,
        accountDigit,
        digit,
        accountingDate,
        releaseDate,
        amount,
        type,
        category,
        historicCode,
        historicDescription,
        complement
    );

    assertThat(register.getId()).isEqualTo(id);
    assertThat(register.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(register.getAgencyDigit()).isEqualTo(agencyDigit);
    assertThat(register.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(register.getAccountDigit()).isEqualTo(accountDigit);
    assertThat(register.getDigit()).isEqualTo(digit);
    assertThat(register.getAccountingDate()).isEqualTo(accountingDate);
    assertThat(register.getReleaseDate()).isEqualTo(releaseDate);
    assertThat(register.getAmount()).isEqualTo(amount);
    assertThat(register.getType()).isEqualTo(type);
    assertThat(register.getCategory()).isEqualTo(category);
    assertThat(register.getHistoricCode()).isEqualTo(historicCode);
    assertThat(register.getHistoricDescription()).isEqualTo(historicDescription);
    assertThat(register.getComplement()).isEqualTo(complement);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var agencyCode = "other_agency_code";
    final var agencyDigit = "other_agency_digit";
    final var accountNumber = "other_account_number";
    final var accountDigit = "other_account_digit";
    final var digit = "other_digit";
    final var accountingDate = "other_accounting_date";
    final var releaseDate = "other_release_date";
    final var amount = "other_amount";
    final var type = RegisterType.DEBIT;
    final var category = "other_category";
    final var historicCode = "other_historic_code";
    final var historicDescription = "other_historic_description";
    final var complement = "other_complement";

    final var register = new CnabRegister();
    register.setId(id);
    register.setAgencyCode(agencyCode);
    register.setAgencyDigit(agencyDigit);
    register.setAccountNumber(accountNumber);
    register.setAccountDigit(accountDigit);
    register.setDigit(digit);
    register.setAccountingDate(accountingDate);
    register.setReleaseDate(releaseDate);
    register.setAmount(amount);
    register.setType(type);
    register.setCategory(category);
    register.setHistoricCode(historicCode);
    register.setHistoricDescription(historicDescription);
    register.setComplement(complement);

    assertThat(register.getId()).isEqualTo(id);
    assertThat(register.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(register.getAgencyDigit()).isEqualTo(agencyDigit);
    assertThat(register.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(register.getAccountDigit()).isEqualTo(accountDigit);
    assertThat(register.getDigit()).isEqualTo(digit);
    assertThat(register.getAccountingDate()).isEqualTo(accountingDate);
    assertThat(register.getReleaseDate()).isEqualTo(releaseDate);
    assertThat(register.getAmount()).isEqualTo(amount);
    assertThat(register.getType()).isEqualTo(type);
    assertThat(register.getCategory()).isEqualTo(category);
    assertThat(register.getHistoricCode()).isEqualTo(historicCode);
    assertThat(register.getHistoricDescription()).isEqualTo(historicDescription);
    assertThat(register.getComplement()).isEqualTo(complement);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var agencyCode = "any_agency_code";
    final var agencyDigit = "any_agency_digit";
    final var accountNumber = "any_account_number";
    final var accountDigit = "any_account_digit";
    final var digit = "any_digit";
    final var accountingDate = "any_accounting_date";
    final var releaseDate = "any_release_date";
    final var amount = "any_amount";
    final var type = RegisterType.DEBIT;
    final var category = "any_category";
    final var historicCode = "any_historic_code";
    final var historicDescription = "any_historic_description";
    final var complement = "any_complement";

    final var register = new CnabRegister(
        id,
        agencyCode,
        agencyDigit,
        accountNumber,
        accountDigit,
        digit,
        accountingDate,
        releaseDate,
        amount,
        type,
        category,
        historicCode,
        historicDescription,
        complement
    );

    assertThat(register.toString()).isEqualTo(
        "CnabRegister{" +
            "id=" + id +
            ", agencyCode='" + agencyCode + '\'' +
            ", agencyDigit='" + agencyDigit + '\'' +
            ", accountNumber='" + accountNumber + '\'' +
            ", accountDigit='" + accountDigit + '\'' +
            ", digit='" + digit + '\'' +
            ", accountingDate='" + accountingDate + '\'' +
            ", releaseDate='" + releaseDate + '\'' +
            ", amount='" + amount + '\'' +
            ", type=" + type +
            ", category='" + category + '\'' +
            ", historicCode='" + historicCode + '\'' +
            ", historicDescription='" + historicDescription + '\'' +
            ", complement='" + complement + '\'' +
            '}'
    );
  }
}
