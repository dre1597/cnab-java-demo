package org.example.cnabjava.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
public class Cnab240Header {
  @Id
  private UUID id = UUID.randomUUID();

  @Column(nullable = false)
  private String cnpj;

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
  private String companyName;

  @Column(nullable = false)
  private String date;

  @Column(nullable = false)
  private String time;

  @Column(nullable = false)
  private String sequentialNumber;

  @Column(nullable = false)
  private String version;

  @Column(nullable = false)
  private int numberOfRegisters;

  @CreationTimestamp
  private Instant createdAt;

  @UpdateTimestamp
  private Instant updatedAt;

  public Cnab240Header() {
  }

  public Cnab240Header(
      final UUID id,
      final String cnpj,
      final String bankCode,
      final String agencyCode,
      final String agencyDigit,
      final String accountNumber,
      final String accountDigit,
      final String digit,
      final String companyName,
      final String date,
      final String time,
      final String sequentialNumber,
      final String version,
      final int numberOfRegisters,
      final Instant createdAt,
      final Instant updatedAt
  ) {
    this.id = id;
    this.cnpj = cnpj;
    this.bankCode = bankCode;
    this.agencyCode = agencyCode;
    this.agencyDigit = agencyDigit;
    this.accountNumber = accountNumber;
    this.accountDigit = accountDigit;
    this.digit = digit;
    this.companyName = companyName;
    this.date = date;
    this.time = time;
    this.sequentialNumber = sequentialNumber;
    this.version = version;
    this.numberOfRegisters = numberOfRegisters;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(final UUID id) {
    this.id = id;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(final String cnpj) {
    this.cnpj = cnpj;
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

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(final String companyName) {
    this.companyName = companyName;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(final String date) {
    this.date = date;
  }

  public String getTime() {
    return this.time;
  }

  public void setTime(final String time) {
    this.time = time;
  }

  public String getSequentialNumber() {
    return this.sequentialNumber;
  }

  public void setSequentialNumber(final String sequentialNumber) {
    this.sequentialNumber = sequentialNumber;
  }

  public String getVersion() {
    return this.version;
  }

  public void setVersion(final String version) {
    this.version = version;
  }

  public int getNumberOfRegisters() {
    return this.numberOfRegisters;
  }

  public void setNumberOfRegisters(final int numberOfRegisters) {
    this.numberOfRegisters = numberOfRegisters;
  }

  public Instant getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(final Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(final Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CnabHeader{" +
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
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
