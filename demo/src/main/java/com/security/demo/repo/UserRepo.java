package com.security.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.security.demo.Model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
	Users findByUsername(String Username);

}
