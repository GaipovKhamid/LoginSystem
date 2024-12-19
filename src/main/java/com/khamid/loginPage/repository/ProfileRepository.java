package com.khamid.loginPage.repository;

import com.khamid.loginPage.entity.RegistrationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfileRepository extends CrudRepository<RegistrationEntity, Integer> {

    Optional<RegistrationEntity> findByUsername(String username);

}
