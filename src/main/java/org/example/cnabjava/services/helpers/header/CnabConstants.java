package org.example.cnabjava.services.helpers.header;

import java.util.List;

public class CnabConstants {
  public static final List<HeaderField> CNAB_240_HEADER_FIELDS = List.of(
      new HeaderField(0, 3, "bankCode"),
      new HeaderField(18, 32, "cnpj"),
      new HeaderField(52, 57, "agencyCode"),
      new HeaderField(58, 70, "accountNumber"),
      new HeaderField(72, 102, "companyName"),
      new HeaderField(143, 151, "date"),
      new HeaderField(151, 157, "time")
  );
  public static final List<HeaderField> CNAB_750_HEADER_FIELDS = List.of(
      new HeaderField(36, 50, "cnpj"),
      new HeaderField(50, 54, "agencyCode"),
      new HeaderField(54, 74, "accountNumber"),
      new HeaderField(253, 353, "companyName")
  );

  private CnabConstants() {
  }
}
