package com.project.smartcontactmanager.dao;

import com.project.smartcontactmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
