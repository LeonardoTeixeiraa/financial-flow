package com.leonardoteixeira.pdfextractor.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    @NotEmpty
    private String username;
    @NotEmpty
    @Column(name = "email", unique = true)
    private String email;
    @NotEmpty
    private String password;
}
