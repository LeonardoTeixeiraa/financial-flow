package com.leonardoteixeira.pdfextractor.identity.service;

import com.leonardoteixeira.pdfextractor.identity.dto.UserRequestDTO;
import com.leonardoteixeira.pdfextractor.identity.dto.UserResponseDTO;
import com.leonardoteixeira.pdfextractor.identity.entity.User;
import com.leonardoteixeira.pdfextractor.identity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserResponseDTO createUser(UserRequestDTO dto){
        User user = toEntity(dto);
        User saved = repository.save(user);
        return toResponseDTO(saved);

    }

    private User toEntity(UserRequestDTO dto){
        User user = new User();
        user.setUsername(dto.username());
        user.setEmail(dto.email());
        user.setPassword(passwordEncoder.encode(dto.password()));
        return user;
    }

    private UserResponseDTO toResponseDTO(User user){
        return new UserResponseDTO(user.getUserId(), user.getEmail(), user.getUsername());
    }
}
