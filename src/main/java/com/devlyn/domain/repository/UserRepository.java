package com.devlyn.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlyn.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
