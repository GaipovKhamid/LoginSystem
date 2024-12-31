package com.khamid.loginPage.repository;

import com.khamid.loginPage.entity.RegistrationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<RegistrationEntity, Integer> {

}
