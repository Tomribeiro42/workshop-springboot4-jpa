package com.educandoweb.course3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course3.entities.User;

public interface UserRepositoty extends JpaRepository<User, Long> {

}
