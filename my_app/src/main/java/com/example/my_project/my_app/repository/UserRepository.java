package com.example.my_project.my_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.my_project.my_app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	User findByEmail(String email);

	//User findByEmail(String username);

}
