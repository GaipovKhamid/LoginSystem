package com.khamid.loginPage.repository;

import com.khamid.loginPage.entity.AuthEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<AuthEntity, Integer> {

}
