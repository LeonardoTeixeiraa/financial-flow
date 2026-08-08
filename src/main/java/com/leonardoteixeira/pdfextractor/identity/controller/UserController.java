package com.leonardoteixeira.pdfextractor.identity.controller;

import com.leonardoteixeira.pdfextractor.identity.dto.UserRequestDTO;
import com.leonardoteixeira.pdfextractor.identity.dto.UserResponseDTO;
import com.leonardoteixeira.pdfextractor.identity.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<String> mensagem (){
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping("/createAccount")
    public ResponseEntity<UserResponseDTO> createUser(@Valid @RequestBody UserRequestDTO requestDTO){
        UserResponseDTO createdUser = service.createUser(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
