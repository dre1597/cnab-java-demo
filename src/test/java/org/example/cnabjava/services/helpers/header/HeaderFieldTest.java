package org.example.cnabjava.services.helpers.header;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HeaderFieldTest {
  @Test
  void shouldCreateRecordWithCorrectValues() {
    final var field = new HeaderField(10, 20, "any_field");

    assertThat(field.start()).isEqualTo(10);
    assertThat(field.end()).isEqualTo(20);
    assertThat(field.name()).isEqualTo("any_field");
  }

  @Test
  void shouldHaveCorrectToString() {
    final var field = new HeaderField(5, 15, "test_field");

    assertThat(field.toString()).contains("test_field");
  }
}
