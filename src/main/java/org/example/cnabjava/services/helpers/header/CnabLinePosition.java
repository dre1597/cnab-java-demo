package org.example.cnabjava.services.helpers.header;

public enum CnabLinePosition {
  HEADER(0);

  private final int position;

  CnabLinePosition(final int position) {
    this.position = position;
  }

  public int getPosition() {
    return this.position;
  }
}
