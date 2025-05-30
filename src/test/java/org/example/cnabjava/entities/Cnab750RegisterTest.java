package org.example.cnabjava.entities;

import org.example.cnabjava.enums.CnabFileStatus;
import org.example.cnabjava.enums.CnabType;
import org.example.cnabjava.enums.PersonType;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class Cnab750RegisterTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var txId = "any_tx_id";
    final var receiptBankIspb = "any_receipt_bank_ispb";
    final var recipientPersonType = PersonType.CNPJ;
    final var recipientAgency = "any_recipient_agency";
    final var recipientAccount = "any_recipient_account";
    final var recipientAccountType = "any_recipient_account_type";
    final var paymentDate = "any_payment_date";
    final var paymentTime = "any_payment_time";
    final var value = "any_value";
    final var payerPersonType = PersonType.CPF;
    final var payerCpfCnpj = "any_payer_cpf_cnpj";
    final var payerName = "any_payer_name";
    final var endToEndId = "any_end_to_end_id";
    final var now = Instant.now();
    final var cnabHeader = this.createCnabHeader();

    final var cnab750Register = new Cnab750Register(
        id,
        txId,
        receiptBankIspb,
        recipientPersonType,
        recipientAgency,
        recipientAccount,
        recipientAccountType,
        paymentDate,
        paymentTime,
        value,
        payerPersonType,
        payerCpfCnpj,
        payerName,
        endToEndId,
        now,
        now,
        cnabHeader
    );

    assertThat(cnab750Register.getId()).isEqualTo(id);
    assertThat(cnab750Register.getTxId()).isEqualTo(txId);
    assertThat(cnab750Register.getReceiptBankIspb()).isEqualTo(receiptBankIspb);
    assertThat(cnab750Register.getRecipientPersonType()).isEqualTo(recipientPersonType);
    assertThat(cnab750Register.getRecipientAgency()).isEqualTo(recipientAgency);
    assertThat(cnab750Register.getRecipientAccount()).isEqualTo(recipientAccount);
    assertThat(cnab750Register.getRecipientAccountType()).isEqualTo(recipientAccountType);
    assertThat(cnab750Register.getPaymentDate()).isEqualTo(paymentDate);
    assertThat(cnab750Register.getPaymentTime()).isEqualTo(paymentTime);
    assertThat(cnab750Register.getValue()).isEqualTo(value);
    assertThat(cnab750Register.getPayerPersonType()).isEqualTo(payerPersonType);
    assertThat(cnab750Register.getPayerCpfCnpj()).isEqualTo(payerCpfCnpj);
    assertThat(cnab750Register.getPayerName()).isEqualTo(payerName);
    assertThat(cnab750Register.getEndToEndId()).isEqualTo(endToEndId);
    assertThat(cnab750Register.getCreatedAt()).isEqualTo(now);
    assertThat(cnab750Register.getUpdatedAt()).isEqualTo(now);
    assertThat(cnab750Register.getCnabHeader()).isEqualTo(cnabHeader);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var txId = "other_tx_id";
    final var receiptBankIspb = "other_receipt_bank_ispb";
    final var recipientPersonType = PersonType.CPF;
    final var recipientAgency = "other_recipient_agency";
    final var recipientAccount = "other_recipient_account";
    final var recipientAccountType = "other_recipient_account_type";
    final var paymentDate = "other_payment_date";
    final var paymentTime = "other_payment_time";
    final var value = "other_value";
    final var payerPersonType = PersonType.CNPJ;
    final var payerCpfCnpj = "other_payer_cpf_cnpj";
    final var payerName = "other_payer_name";
    final var endToEndId = "other_end_to_end_id";
    final var now = Instant.now();
    final var cnabHeader = this.createCnabHeader();

    final var cnab750Register = new Cnab750Register();
    cnab750Register.setId(id);
    cnab750Register.setTxId(txId);
    cnab750Register.setReceiptBankIspb(receiptBankIspb);
    cnab750Register.setRecipientPersonType(recipientPersonType);
    cnab750Register.setRecipientAgency(recipientAgency);
    cnab750Register.setRecipientAccount(recipientAccount);
    cnab750Register.setRecipientAccountType(recipientAccountType);
    cnab750Register.setPaymentDate(paymentDate);
    cnab750Register.setPaymentTime(paymentTime);
    cnab750Register.setValue(value);
    cnab750Register.setPayerPersonType(payerPersonType);
    cnab750Register.setPayerCpfCnpj(payerCpfCnpj);
    cnab750Register.setPayerName(payerName);
    cnab750Register.setEndToEndId(endToEndId);
    cnab750Register.setCreatedAt(now);
    cnab750Register.setUpdatedAt(now);
    cnab750Register.setCnabHeader(cnabHeader);

    assertThat(cnab750Register.getId()).isEqualTo(id);
    assertThat(cnab750Register.getTxId()).isEqualTo(txId);
    assertThat(cnab750Register.getReceiptBankIspb()).isEqualTo(receiptBankIspb);
    assertThat(cnab750Register.getRecipientPersonType()).isEqualTo(recipientPersonType);
    assertThat(cnab750Register.getRecipientAgency()).isEqualTo(recipientAgency);
    assertThat(cnab750Register.getRecipientAccount()).isEqualTo(recipientAccount);
    assertThat(cnab750Register.getRecipientAccountType()).isEqualTo(recipientAccountType);
    assertThat(cnab750Register.getPaymentDate()).isEqualTo(paymentDate);
    assertThat(cnab750Register.getPaymentTime()).isEqualTo(paymentTime);
    assertThat(cnab750Register.getValue()).isEqualTo(value);
    assertThat(cnab750Register.getPayerPersonType()).isEqualTo(payerPersonType);
    assertThat(cnab750Register.getPayerCpfCnpj()).isEqualTo(payerCpfCnpj);
    assertThat(cnab750Register.getPayerName()).isEqualTo(payerName);
    assertThat(cnab750Register.getEndToEndId()).isEqualTo(endToEndId);
    assertThat(cnab750Register.getCreatedAt()).isEqualTo(now);
    assertThat(cnab750Register.getUpdatedAt()).isEqualTo(now);
    assertThat(cnab750Register.getCnabHeader()).isEqualTo(cnabHeader);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var txId = "any_tx_id";
    final var receiptBankIspb = "any_receipt_bank_ispb";
    final var recipientPersonType = PersonType.CNPJ;
    final var recipientAgency = "any_recipient_agency";
    final var recipientAccount = "any_recipient_account";
    final var recipientAccountType = "any_recipient_account_type";
    final var paymentDate = "any_payment_date";
    final var paymentTime = "any_payment_time";
    final var value = "any_value";
    final var payerPersonType = PersonType.CPF;
    final var payerCpfCnpj = "any_payer_cpf_cnpj";
    final var payerName = "any_payer_name";
    final var endToEndId = "any_end_to_end_id";
    final var now = Instant.now();
    final var cnabHeader = this.createCnabHeader();

    final var cnab750Register = new Cnab750Register(
        id,
        txId,
        receiptBankIspb,
        recipientPersonType,
        recipientAgency,
        recipientAccount,
        recipientAccountType,
        paymentDate,
        paymentTime,
        value,
        payerPersonType,
        payerCpfCnpj,
        payerName,
        endToEndId,
        now,
        now,
        cnabHeader
    );

    assertThat(cnab750Register.toString()).hasToString("Cnab750Register{" +
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
        ", createdAt=" + now +
        ", updatedAt=" + now +
        ", cnab750Header=" + cnabHeader +
        '}');
  }

  private Cnab750Header createCnabHeader() {
    final var now = Instant.now();
    return new Cnab750Header(
        UUID.randomUUID(),
        "any_cnpj",
        "any_agency_code",
        "any_account_number",
        "any_company_name",
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
        CnabType.CNAB750,
        null,
        now,
        now
    );
  }
}
