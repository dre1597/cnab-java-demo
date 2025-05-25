package org.example.cnabjava.services.helpers.header;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CnabLinePositionTest {
  @Test
  void shouldReturnCorrectPosition() {
    assertThat(CnabLinePosition.HEADER.getPosition()).isEqualTo(0);
  }
}
