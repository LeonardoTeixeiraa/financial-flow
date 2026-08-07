package com.leonardoteixeira.pdfextractor.identity.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "user_id")
    private UUID userId;

    @NotBlank
    @Column(length = 100, nullable = false)
    private String username;

    @Email
    @NotBlank
    @Column(name = "email", length = 100, unique = true, nullable = false)
    private String email;

    @NotBlank
    @Column(length = 255, nullable = false)
    private String password;
}
