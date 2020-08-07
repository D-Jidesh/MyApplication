package com.example.my_project.my_app.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.my_project.my_app.models.User;
import com.example.my_project.my_app.web.dto.UserRegistrationDto;

public interface UserService  extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
