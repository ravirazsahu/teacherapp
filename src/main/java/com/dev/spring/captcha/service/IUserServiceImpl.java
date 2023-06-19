package com.dev.spring.captcha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.spring.captcha.repo.User;
import com.dev.spring.captcha.repo.UserRepository;

@Service
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	UserRepository userrepo;
	
	@Override
	public void createuser(User user) {
		// TODO Auto-generated method stub
		userrepo.save(user);
		
	}
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}
	
	@Override
	public Optional<User> getOneuser(Integer id) {
		// TODO Auto-generated method stub
		return userrepo.findById(id);
	}

}
