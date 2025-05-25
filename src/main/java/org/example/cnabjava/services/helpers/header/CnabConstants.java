package org.example.cnabjava.services.helpers.header;

import java.util.List;

public class CnabConstants {
  public static final List<HeaderField> CNAB_240_HEADER_FIELDS = List.of(
      new HeaderField(18, 32, "cnpj"),
      new HeaderField(52, 57, "agencyCode"),
      new HeaderField(57, 58, "agencyDigit"),
      new HeaderField(58, 70, "checkingAccount"),
      new HeaderField(70, 71, "companyCheckingAccountDigit"),
      new HeaderField(71, 72, "digit"),
      new HeaderField(72, 102, "companyName"),
      new HeaderField(102, 132, "bankName"),
      new HeaderField(143, 151, "cnabDate"),
      new HeaderField(151, 157, "cnabTime"),
      new HeaderField(157, 163, "sequentialNumber"),
      new HeaderField(163, 166, "version")
  );
  public static final List<HeaderField> CNAB_750_HEADER_FIELDS = List.of(
      new HeaderField(36, 50, "cnpj"),
      new HeaderField(50, 54, "agency"),
      new HeaderField(54, 74, "companyAccount"),
      new HeaderField(78, 155, "pixKey"),
      new HeaderField(155, 163, "cnabDate"),
      new HeaderField(253, 353, "companyName"),
      new HeaderField(731, 741, "returnSequentialNumber"),
      new HeaderField(741, 744, "version"),
      new HeaderField(744, 750, "registerSequentialNumber")
  );

  private CnabConstants() {
  }
}
