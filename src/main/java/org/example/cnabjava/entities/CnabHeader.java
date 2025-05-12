package org.example.cnabjava.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class CnabHeader {
  @Id
  private UUID id = UUID.randomUUID();

  @Column(nullable = false)
  private String bankCode;

  @Column(nullable = false)
  private String agencyCode;

  @Column(nullable = false)
  private String agencyDigit;

  @Column(nullable = false)
  private String accountNumber;

  @Column(nullable = false)
  private String accountDigit;

  @Column(nullable = false)
  private String digit;

  @Column(nullable = false)
  private String date;

  public CnabHeader() {
  }

  public CnabHeader(
      final UUID id,
      final String bankCode,
      final String agencyCode,
      final String agencyDigit,
      final String accountNumber,
      final String accountDigit,
      final String digit,
      final String date
  ) {
    this.id = id;
    this.bankCode = bankCode;
    this.agencyCode = agencyCode;
    this.agencyDigit = agencyDigit;
    this.accountNumber = accountNumber;
    this.accountDigit = accountDigit;
    this.digit = digit;
    this.date = date;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(final UUID id) {
    this.id = id;
  }

  public String getBankCode() {
    return this.bankCode;
  }

  public void setBankCode(final String bankCode) {
    this.bankCode = bankCode;
  }

  public String getAgencyCode() {
    return this.agencyCode;
  }

  public void setAgencyCode(final String agencyCode) {
    this.agencyCode = agencyCode;
  }

  public String getAgencyDigit() {
    return this.agencyDigit;
  }

  public void setAgencyDigit(final String agencyDigit) {
    this.agencyDigit = agencyDigit;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(final String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountDigit() {
    return this.accountDigit;
  }

  public void setAccountDigit(final String accountDigit) {
    this.accountDigit = accountDigit;
  }

  public String getDigit() {
    return this.digit;
  }

  public void setDigit(final String digit) {
    this.digit = digit;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(final String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "CnabHeader{" +
        "id=" + id +
        ", bankCode='" + bankCode + '\'' +
        ", agencyCode='" + agencyCode + '\'' +
        ", agencyDigit='" + agencyDigit + '\'' +
        ", accountNumber='" + accountNumber + '\'' +
        ", accountDigit='" + accountDigit + '\'' +
        ", digit='" + digit + '\'' +
        ", date='" + date + '\'' +
        '}';
  }
}
