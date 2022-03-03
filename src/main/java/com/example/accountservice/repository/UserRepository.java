package com.example.accountservice.repository;

import com.example.accountservice.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long> {
    DAOUser findByUsername(String username);

}