package com.khamid.loginPage.service;

import com.khamid.loginPage.dto.RegistrationDTO;
import com.khamid.loginPage.entity.AuthEntity;
import com.khamid.loginPage.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class AuthService {

    @Autowired
    ProfileRepository profileRepository; 

    public RegistrationDTO auth(RegistrationDTO dto) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your email: ");
//        String email = scanner.next();
//
//        System.out.print("Enter your password: ");
//        String password = scanner.next();

        AuthEntity entity = new AuthEntity();
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());

        profileRepository.save(entity); //

        dto.setId(entity.getId());
        return dto;

    }
}
