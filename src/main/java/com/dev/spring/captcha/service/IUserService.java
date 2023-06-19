package com.dev.spring.captcha.service;

import java.util.List;
import java.util.Optional;

import com.dev.spring.captcha.repo.User;

public interface IUserService{
	
	void createuser(User user);
	List<User> getAllUsers();
	Optional<User> getOneuser(Integer id);

}
