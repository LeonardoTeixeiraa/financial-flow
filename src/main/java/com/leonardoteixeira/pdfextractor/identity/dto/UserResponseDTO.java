package com.leonardoteixeira.pdfextractor.identity.dto;

import java.util.UUID;

public record UserResponseDTO(UUID id,
                              String username,
                              String email) {
}
