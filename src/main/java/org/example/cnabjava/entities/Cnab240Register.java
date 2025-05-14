package org.example.cnabjava.entities;

import jakarta.persistence.*;
import org.example.cnabjava.enums.Cnab240RegisterType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
public class Cnab240Register {
  @Id
  private UUID id = UUID.randomUUID();

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
  private String accountingDate;

  @Column(nullable = false)
  private String releaseDate;

  @Column(nullable = false)
  private String amount;

  @Column(nullable = false)
  private Cnab240RegisterType type;

  @Column(nullable = false)
  private String category;

  @Column(nullable = false)
  private String historicCode;

  @Column(nullable = false)
  private String historicDescription;

  @Column(nullable = false)
  private String complement;

  @CreationTimestamp
  private Instant createdAt;

  @UpdateTimestamp
  private Instant updatedAt;

  @ManyToOne
  @JoinColumn(name = "cnab_header_id", nullable = false)
  private Cnab240Header cnabHeader;

  public Cnab240Register() {}

  public Cnab240Register(
      final UUID id,
      final String agencyCode,
      final String agencyDigit,
      final String accountNumber,
      final String accountDigit,
      final String digit,
      final String accountingDate,
      final String releaseDate,
      final String amount,
      final Cnab240RegisterType type,
      final String category,
      final String historicCode,
      final String historicDescription,
      final String complement,
      final Instant createdAt,
      final Instant updatedAt,
      final Cnab240Header cnabHeader
  ) {
    this.id = id;
    this.agencyCode = agencyCode;
    this.agencyDigit = agencyDigit;
    this.accountNumber = accountNumber;
    this.accountDigit = accountDigit;
    this.digit = digit;
    this.accountingDate = accountingDate;
    this.releaseDate = releaseDate;
    this.amount = amount;
    this.type = type;
    this.category = category;
    this.historicCode = historicCode;
    this.historicDescription = historicDescription;
    this.complement = complement;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.cnabHeader = cnabHeader;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(final UUID id) {
    this.id = id;
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

  public String getAccountingDate() {
    return this.accountingDate;
  }

  public void setAccountingDate(final String accountingDate) {
    this.accountingDate = accountingDate;
  }

  public String getReleaseDate() {
    return this.releaseDate;
  }

  public void setReleaseDate(final String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getAmount() {
    return this.amount;
  }

  public void setAmount(final String amount) {
    this.amount = amount;
  }

  public Cnab240RegisterType getType() {
    return this.type;
  }

  public void setType(final Cnab240RegisterType type) {
    this.type = type;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(final String category) {
    this.category = category;
  }

  public String getHistoricCode() {
    return this.historicCode;
  }

  public void setHistoricCode(final String historicCode) {
    this.historicCode = historicCode;
  }

  public String getHistoricDescription() {
    return this.historicDescription;
  }

  public void setHistoricDescription(final String historicDescription) {
    this.historicDescription = historicDescription;
  }

  public String getComplement() {
    return this.complement;
  }

  public void setComplement(final String complement) {
    this.complement = complement;
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

  public Cnab240Header getCnabHeader() {
    return this.cnabHeader;
  }

  public void setCnabHeader(final Cnab240Header cnabHeader) {
    this.cnabHeader = cnabHeader;
  }

  @Override
  public String toString() {
    return "CnabRegister{" +
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
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", cnabHeader=" + cnabHeader +
        '}';
  }
}
