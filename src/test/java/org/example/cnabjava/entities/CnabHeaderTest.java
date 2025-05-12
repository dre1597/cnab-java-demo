package org.example.cnabjava.entities;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class CnabHeaderTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var bankCode = "any_bank_code";
    final var agencyCode = "any_agency_code";
    final var accountNumber = "any_account_number";
    final var accountDigit = "any_account_digit";
    final var agencyDigit = "any_agency_digit";
    final var digit = "any_digit";
    final var date = "any_date";
    final var now = Instant.now();

    final var header = new CnabHeader(
        id,
        bankCode,
        agencyCode,
        agencyDigit,
        accountNumber,
        accountDigit,
        digit,
        date,
        now,
        now
    );

    assertThat(header.getId()).isEqualTo(id);
    assertThat(header.getBankCode()).isEqualTo(bankCode);
    assertThat(header.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(header.getAgencyDigit()).isEqualTo(agencyDigit);
    assertThat(header.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(header.getAccountDigit()).isEqualTo(accountDigit);
    assertThat(header.getDate()).isEqualTo(date);
    assertThat(header.getDigit()).isEqualTo(digit);
    assertThat(header.getCreatedAt()).isEqualTo(now);
    assertThat(header.getUpdatedAt()).isEqualTo(now);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var bankCode = "other_bank_code";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var accountDigit = "other_account_digit";
    final var agencyDigit = "other_agency_digit";
    final var digit = "other_digit";
    final var date = "other_date";
    final var now = Instant.now();

    final var header = new CnabHeader();
    header.setId(id);
    header.setBankCode(bankCode);
    header.setAgencyCode(agencyCode);
    header.setAccountNumber(accountNumber);
    header.setAccountDigit(accountDigit);
    header.setAgencyDigit(agencyDigit);
    header.setDate(date);
    header.setDigit(digit);
    header.setCreatedAt(now);
    header.setUpdatedAt(now);

    assertThat(header.getId()).isEqualTo(id);
    assertThat(header.getBankCode()).isEqualTo(bankCode);
    assertThat(header.getAgencyCode()).isEqualTo(agencyCode);
    assertThat(header.getAgencyDigit()).isEqualTo(agencyDigit);
    assertThat(header.getAccountNumber()).isEqualTo(accountNumber);
    assertThat(header.getAccountDigit()).isEqualTo(accountDigit);
    assertThat(header.getDate()).isEqualTo(date);
    assertThat(header.getDigit()).isEqualTo(digit);
    assertThat(header.getCreatedAt()).isEqualTo(now);
    assertThat(header.getUpdatedAt()).isEqualTo(now);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var bankCode = "other_bank_code";
    final var agencyCode = "other_agency_code";
    final var accountNumber = "other_account_number";
    final var accountDigit = "other_account_digit";
    final var agencyDigit = "other_agency_digit";
    final var digit = "other_digit";
    final var date = "other_date";
    final var now = Instant.now();

    final var header = new CnabHeader(
        id,
        bankCode,
        agencyCode,
        agencyDigit,
        accountNumber,
        accountDigit,
        digit,
        date,
        now,
        now
    );

    assertThat(header.toString()).hasToString("CnabHeader{" +
        "id=" + id +
        ", bankCode='" + bankCode + '\'' +
        ", agencyCode='" + agencyCode + '\'' +
        ", agencyDigit='" + agencyDigit + '\'' +
        ", accountNumber='" + accountNumber + '\'' +
        ", accountDigit='" + accountDigit + '\'' +
        ", digit='" + digit + '\'' +
        ", date='" + date + '\'' +
        ", createdAt=" + now +
        ", updatedAt=" + now +
        '}');
  }
}
