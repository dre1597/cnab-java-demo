package org.example.cnabjava.services.helpers.header;

public record HeaderField(
    int start,
    int end,
    String name
) {
}
