package org.example.cnabjava.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
public class Cnab240Header {
  @Id
  private UUID id = UUID.randomUUID();

  @Column(nullable = false)
  private String bankCode;

  @Column(nullable = false)
  private String cnpj;

  @Column(nullable = false)
  private String agencyCode;

  @Column(nullable = false)
  private String accountNumber;

  @Column(nullable = false)
  private String companyName;

  @Column(nullable = false)
  private String date;

  @Column(nullable = false)
  private String time;

  @Column(nullable = false)
  private int numberOfRegisters;

  @CreationTimestamp
  private Instant createdAt;

  @UpdateTimestamp
  private Instant updatedAt;

  @ManyToOne
  @JoinColumn(name = "cnab_file_id", nullable = false)
  private CnabFile cnabFile;

  public Cnab240Header() {
  }

  public Cnab240Header(
      final UUID id,
      final String bankCode,
      final String cnpj,
      final String agencyCode,
      final String accountNumber,
      final String companyName,
      final String date,
      final String time,
      final int numberOfRegisters,
      final Instant createdAt,
      final Instant updatedAt,
      final CnabFile cnabFile
  ) {
    this.id = id;
    this.bankCode = bankCode;
    this.cnpj = cnpj;
    this.agencyCode = agencyCode;
    this.accountNumber = accountNumber;
    this.companyName = companyName;
    this.date = date;
    this.time = time;
    this.numberOfRegisters = numberOfRegisters;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.cnabFile = cnabFile;
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

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(final String cnpj) {
    this.cnpj = cnpj;
  }

  public String getAgencyCode() {
    return this.agencyCode;
  }

  public void setAgencyCode(final String agencyCode) {
    this.agencyCode = agencyCode;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(final String accountNumber) {
    this.accountNumber = accountNumber;
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

  public CnabFile getCnabFile() {
    return this.cnabFile;
  }

  public void setCnabFile(final CnabFile cnabFile) {
    this.cnabFile = cnabFile;
  }

  @Override
  public String toString() {
    return "CnabHeader{" +
        "id=" + id +
        ", bankCode='" + bankCode + '\'' +
        ", cnpj='" + cnpj + '\'' +
        ", agencyCode='" + agencyCode + '\'' +
        ", accountNumber='" + accountNumber + '\'' +
        ", companyName='" + companyName + '\'' +
        ", date='" + date + '\'' +
        ", time='" + time + '\'' +
        ", numberOfRegisters=" + numberOfRegisters +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", cnabFile=" + cnabFile +
        '}';
  }
}
