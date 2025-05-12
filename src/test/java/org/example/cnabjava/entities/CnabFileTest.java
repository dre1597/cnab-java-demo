package org.example.cnabjava.entities;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class CnabFileTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var key = UUID.randomUUID();
    final var status = CnabFileStatus.FAILED;
    final var error = "any_error";

    final var file = new CnabFile(id, key, status, error);

    assertThat(file.getId()).isEqualTo(id);
    assertThat(file.getKey()).isEqualTo(key);
    assertThat(file.getStatus()).isEqualTo(status);
    assertThat(file.getErrorMessage()).isEqualTo(error);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var key = UUID.randomUUID();
    final var status = CnabFileStatus.FAILED;
    final var error = "other_error";

    final var file = new CnabFile();
    file.setId(id);
    file.setKey(key);
    file.setStatus(status);
    file.setErrorMessage(error);

    assertThat(file.getId()).isEqualTo(id);
    assertThat(file.getKey()).isEqualTo(key);
    assertThat(file.getStatus()).isEqualTo(status);
    assertThat(file.getErrorMessage()).isEqualTo(error);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var key = UUID.randomUUID();
    final var status = CnabFileStatus.SUCCESS;
    final String errorMessage = null;

    final var file = new CnabFile(id, key, status, errorMessage);

    final var result = file.toString();

    assertThat(result)
        .contains("id=" + id)
        .contains("key=" + key)
        .contains("status=" + status)
        .contains("errorMessage=");
  }
}
