package org.example.cnabjava.entities;

import jakarta.persistence.*;
import org.example.cnabjava.enums.PersonType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
public class Cnab750Register {
  @Id
  private UUID id = UUID.randomUUID();

  @Column(nullable = false)
  private String txId;

  @Column(nullable = false)
  private String receiptBankIspb;

  @Column(nullable = false)
  private PersonType recipientPersonType;

  @Column(nullable = false)
  private String recipientAgency;

  @Column(nullable = false)
  private String recipientAccount;

  @Column(nullable = false)
  private String recipientAccountType;

  @Column(nullable = false)
  private String paymentDate;

  @Column(nullable = false)
  private String paymentTime;

  @Column(nullable = false)
  private String value;

  @Column(nullable = false)
  private PersonType payerPersonType;

  @Column(nullable = false)
  private String payerCpfCnpj;

  @Column(nullable = false)
  private String payerName;

  @Column(nullable = false)
  private String endToEndId;

  @CreationTimestamp
  private Instant createdAt;

  @UpdateTimestamp
  private Instant updatedAt;

  @ManyToOne
  @JoinColumn(name = "cnab_header_id", nullable = false)
  private Cnab750Header cnabHeader;

  public Cnab750Register() {
  }

  public Cnab750Register(
      final UUID id,
      final String txId,
      final String receiptBankIspb,
      final PersonType recipientPersonType,
      final String recipientAgency,
      final String recipientAccount,
      final String recipientAccountType,
      final String paymentDate,
      final String paymentTime,
      final String value,
      final PersonType payerPersonType,
      final String payerCpfCnpj,
      final String payerName,
      final String endToEndId,
      final Instant createdAt,
      final Instant updatedAt,
      final Cnab750Header cnab750Header
  ) {
    this.id = id;
    this.txId = txId;
    this.receiptBankIspb = receiptBankIspb;
    this.recipientPersonType = recipientPersonType;
    this.recipientAgency = recipientAgency;
    this.recipientAccount = recipientAccount;
    this.recipientAccountType = recipientAccountType;
    this.paymentDate = paymentDate;
    this.paymentTime = paymentTime;
    this.value = value;
    this.payerPersonType = payerPersonType;
    this.payerCpfCnpj = payerCpfCnpj;
    this.payerName = payerName;
    this.endToEndId = endToEndId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.cnabHeader = cnab750Header;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(final UUID id) {
    this.id = id;
  }

  public String getTxId() {
    return this.txId;
  }

  public void setTxId(final String txId) {
    this.txId = txId;
  }

  public String getReceiptBankIspb() {
    return this.receiptBankIspb;
  }

  public void setReceiptBankIspb(final String receiptBankIspb) {
    this.receiptBankIspb = receiptBankIspb;
  }

  public PersonType getRecipientPersonType() {
    return this.recipientPersonType;
  }

  public void setRecipientPersonType(final PersonType recipientPersonType) {
    this.recipientPersonType = recipientPersonType;
  }

  public String getRecipientAgency() {
    return this.recipientAgency;
  }

  public void setRecipientAgency(final String recipientAgency) {
    this.recipientAgency = recipientAgency;
  }

  public String getRecipientAccount() {
    return this.recipientAccount;
  }

  public void setRecipientAccount(final String recipientAccount) {
    this.recipientAccount = recipientAccount;
  }

  public String getRecipientAccountType() {
    return this.recipientAccountType;
  }

  public void setRecipientAccountType(final String recipientAccountType) {
    this.recipientAccountType = recipientAccountType;
  }

  public String getPaymentDate() {
    return this.paymentDate;
  }

  public void setPaymentDate(final String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public String getPaymentTime() {
    return this.paymentTime;
  }

  public void setPaymentTime(final String paymentTime) {
    this.paymentTime = paymentTime;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(final String value) {
    this.value = value;
  }

  public PersonType getPayerPersonType() {
    return this.payerPersonType;
  }

  public void setPayerPersonType(final PersonType payerPersonType) {
    this.payerPersonType = payerPersonType;
  }

  public String getPayerCpfCnpj() {
    return this.payerCpfCnpj;
  }

  public void setPayerCpfCnpj(final String payerCpfCnpj) {
    this.payerCpfCnpj = payerCpfCnpj;
  }

  public String getPayerName() {
    return this.payerName;
  }

  public void setPayerName(final String payerName) {
    this.payerName = payerName;
  }

  public String getEndToEndId() {
    return this.endToEndId;
  }

  public void setEndToEndId(final String endToEndId) {
    this.endToEndId = endToEndId;
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

  public Cnab750Header getCnabHeader() {
    return this.cnabHeader;
  }

  public void setCnabHeader(final Cnab750Header cnab750Header) {
    this.cnabHeader = cnab750Header;
  }

  @Override
  public String toString() {
    return "Cnab750Register{" +
        "id=" + id +
        ", txId='" + txId + '\'' +
        ", receiptBankIspb='" + receiptBankIspb + '\'' +
        ", recipientPersonType=" + recipientPersonType +
        ", recipientAgency='" + recipientAgency + '\'' +
        ", recipientAccount='" + recipientAccount + '\'' +
        ", recipientAccountType='" + recipientAccountType + '\'' +
        ", paymentDate='" + paymentDate + '\'' +
        ", paymentTime='" + paymentTime + '\'' +
        ", value='" + value + '\'' +
        ", payerPersonType=" + payerPersonType +
        ", payerCpfCnpj='" + payerCpfCnpj + '\'' +
        ", payerName='" + payerName + '\'' +
        ", endToEndId='" + endToEndId + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", cnab750Header=" + cnabHeader +
        '}';
  }
}
