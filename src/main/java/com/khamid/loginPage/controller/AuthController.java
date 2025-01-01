package com.khamid.loginPage.controller;

import com.khamid.loginPage.dto.RegistrationDTO;
import com.khamid.loginPage.entity.AuthEntity;
import com.khamid.loginPage.repository.ProfileRepository;
import com.khamid.loginPage.service.AuthService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    public AuthService service;

    @PostMapping("/new")
    private ResponseEntity<RegistrationDTO> neew(@RequestBody RegistrationDTO dto) {
        RegistrationDTO result = service.auth(dto);
        return ResponseEntity.ok(result);
    }


}
