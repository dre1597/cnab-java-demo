package org.example.cnabjava.services.helpers.header;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CnabExtractHeaderData {
  private final String cnabRaw;

  public CnabExtractHeaderData(final String cnabRaw) {
    this.cnabRaw = cnabRaw;
  }

  public Map<String, Object> getHeaderInfo(final List<HeaderField> fields) {
    final var header = extractHeader();

    return fields.stream()
        .collect(Collectors.toMap(
            HeaderField::name,
            field -> extractField(field, header)
        ));
  }

  private Object extractField(final HeaderField field, final String line) {
    return line.substring(field.start(), field.end()).trim();
  }

  protected final String extractHeader() {
    final var lines = Arrays.asList(cnabRaw.split("\n"));
    return lines.get(CnabLinePosition.HEADER.getPosition());
  }
}
