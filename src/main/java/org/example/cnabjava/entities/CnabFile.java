package org.example.cnabjava.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity()
public class CnabFile {
  @Id
  private UUID id = UUID.randomUUID();

  @Column(nullable = false)
  private UUID key;

  @Column(nullable = false)
  private CnabFileStatus status;

  @Column
  private String errorMessage;

  public CnabFile() {
  }

  public CnabFile(
      final UUID id,
      final UUID key,
      final CnabFileStatus status,
      final String errorMessage
  ) {
    this.id = id;
    this.key = key;
    this.status = status;
    this.errorMessage = errorMessage;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(final UUID id) {
    this.id = id;
  }

  public UUID getKey() {
    return this.key;
  }

  public void setKey(final UUID key) {
    this.key = key;
  }

  public CnabFileStatus getStatus() {
    return this.status;
  }

  public void setStatus(final CnabFileStatus status) {
    this.status = status;
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(final String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public String toString() {
    return "CnabFile{" +
        "id=" + id +
        ", key=" + key +
        ", status=" + status +
        ", errorMessage='" + errorMessage + '\'' +
        '}';
  }
}
