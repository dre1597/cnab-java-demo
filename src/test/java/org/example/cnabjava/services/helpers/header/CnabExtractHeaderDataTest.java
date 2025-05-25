package org.example.cnabjava.services.helpers.header;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class CnabExtractHeaderDataTest {
  @Test
  void shouldExtractHeaderFieldsForCnab240() {
    final var cnabRaw = "00100013E040330                              22212345000189EMPRESA TESTE BB      12345678901234567890 00001A000000123456D0000000012345D AEMPRESA TESTE BB              20250524 00000000100000D1RBR000010                                             \n";
    final var extractor = new CnabExtractHeaderData(cnabRaw);

    final var result = extractor.getHeaderInfo(CnabConstants.CNAB_240_HEADER_FIELDS);

    assertThat(result).isInstanceOf(Map.class);
    assertThat(result).containsKeys(
        "bankCode", "cnpj", "agencyCode", "accountNumber", "companyName",
        "date", "time"
    );
  }

  @Test
  void shouldExtractHeaderFieldsForCnab750() {
    final var cnabRaw = "020RETORNO02PIX           12345678 01 12345678000195                                1234 00000001234567890123CORR123e-mail@empresa.com.br                                                                                          20250525COVEMPRESA TESTE PSP                         Uso exclusivo do PSP recebedor                                                   EMPRESA TESTE RECEBEDORA                                                              SEMERRO                                                                                                                                                                                                                                                                                                                                            0000000001002000001\n";
    final var extractor = new CnabExtractHeaderData(cnabRaw);

    final var result = extractor.getHeaderInfo(CnabConstants.CNAB_750_HEADER_FIELDS);

    assertThat(result).isInstanceOf(Map.class);
    assertThat(result).containsKeys(
        "cnpj", "agencyCode", "accountNumber", "companyName"
    );
  }

  @Test
  void shouldExtractCorrectFieldValues() {
    final var testLine = "1234567890123456789012345678901234567890";
    final var fields = List.of(
        new HeaderField(5, 10, "any_field"),
        new HeaderField(10, 15, "other_field")
    );
    final var extractor = new CnabExtractHeaderData(testLine);

    final var result = extractor.getHeaderInfo(fields);

    assertThat(result).containsEntry("any_field", "67890");
    assertThat(result).containsEntry("other_field", "12345");
  }
}
