package com.eren.JPA.springJPA.service;

import com.eren.JPA.springJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
