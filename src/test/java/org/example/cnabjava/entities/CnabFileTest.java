package org.example.cnabjava.entities;

import org.example.cnabjava.enums.CnabFileStatus;
import org.example.cnabjava.enums.CnabType;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class CnabFileTest {
  @Test
  void shouldCreateUsingAllArgsConstructor() {
    final var id = UUID.randomUUID();
    final var fileName = "any_file_name";
    final var status = CnabFileStatus.FAILED;
    final var type = CnabType.CNAB240;
    final var error = "any_error";
    final var now = Instant.now();

    final var file = new CnabFile(id, fileName, status, type, error, now, now);

    assertThat(file.getId()).isEqualTo(id);
    assertThat(file.getFileName()).isEqualTo(fileName);
    assertThat(file.getStatus()).isEqualTo(status);
    assertThat(file.getType()).isEqualTo(type);
    assertThat(file.getErrorMessage()).isEqualTo(error);
    assertThat(file.getCreatedAt()).isEqualTo(now);
    assertThat(file.getUpdatedAt()).isEqualTo(now);
  }

  @Test
  void shouldSetAndGetAllFields() {
    final var id = UUID.randomUUID();
    final var fileName = "any_file_name";
    final var status = CnabFileStatus.FAILED;
    final var type = CnabType.CNAB240;
    final var error = "other_error";
    final var now = Instant.now();

    final var file = new CnabFile();
    file.setId(id);
    file.setFileName(fileName);
    file.setStatus(status);
    file.setType(type);
    file.setErrorMessage(error);
    file.setCreatedAt(now);
    file.setUpdatedAt(now);

    assertThat(file.getId()).isEqualTo(id);
    assertThat(file.getFileName()).isEqualTo(fileName);
    assertThat(file.getStatus()).isEqualTo(status);
    assertThat(file.getType()).isEqualTo(type);
    assertThat(file.getErrorMessage()).isEqualTo(error);
    assertThat(file.getCreatedAt()).isEqualTo(now);
    assertThat(file.getUpdatedAt()).isEqualTo(now);
  }

  @Test
  void shouldGenerateToString() {
    final var id = UUID.randomUUID();
    final var fileName = "any_file_name";
    final var status = CnabFileStatus.SUCCESS;
    final var type = CnabType.CNAB240;
    final var now = Instant.now();

    final var file = new CnabFile(id, fileName, status, type, null, now, now);

    assertThat(file.toString()).hasToString("CnabFile{" +
        "id=" + id +
        ", fileName=" + fileName +
        ", status=SUCCESS" +
        ", type=CNAB240" +
        ", errorMessage='null'" +
        ", createdAt=" + now +
        ", updatedAt=" + now +
        '}');
  }
}
