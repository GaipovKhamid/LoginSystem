package com.khamid.loginPage.service;

import com.khamid.loginPage.dto.RegistrationDTO;
import com.khamid.loginPage.entity.RegistrationEntity;
import com.khamid.loginPage.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    private ProfileRepository profileRepository;

    public String regisrtation(RegistrationDTO dto) {
        Optional<RegistrationEntity> optional = profileRepository.findByUsername(dto);
        if (optional.isPresent()) {
            return "Email already exist";
        }
        return null;
    }

}
