package com.utxj.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utxj.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
