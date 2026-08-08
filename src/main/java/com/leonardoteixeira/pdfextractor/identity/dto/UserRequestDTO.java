package com.leonardoteixeira.pdfextractor.identity.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public record UserRequestDTO(
        String username,
        @Email
        String email,
        @Size(min = 6)
        String password) {
}
