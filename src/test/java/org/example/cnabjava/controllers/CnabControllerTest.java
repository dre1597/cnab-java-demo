package org.example.cnabjava.controllers;

import org.example.cnabjava.services.CnabService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CnabControllerTest {
  @Mock
  private CnabService cnabService;

  @InjectMocks
  private CnabController cnabController;

  @Test
  void shouldCallServiceWithUploadedFile() {
    final var file = new MockMultipartFile(
        "file",
        "test.txt",
        MediaType.TEXT_PLAIN_VALUE,
        "any_content".getBytes()
    );

    cnabController.create(file);

    verify(cnabService).create(file);
  }
}
