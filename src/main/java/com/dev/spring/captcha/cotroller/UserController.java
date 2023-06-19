package com.dev.spring.captcha.cotroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.spring.captcha.repo.User;
import com.dev.spring.captcha.service.IUserService;
import com.dev.spring.captcha.util.CaptchaUtil;

import cn.apiclub.captcha.Captcha;
import jdk.internal.org.jline.utils.Log;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@GetMapping("/register")
	public String registerUser(Model model) {
		Log.info("in registeruser");
		User user = new User();
		getCaptcha(user);
		model.addAttribute("user", user);
		return "registerUser";
	}
	
	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute User user,
			Model model
			) {
		if(user.getCaptcha().equals(user.getHiddencataptch())) {
		service.createuser(user);
		model.addAttribute("message", "User Registered successfully!");
		return "redirect:allUsers";
		} 
		else {
		model.addAttribute("message", "Invalid Captcha");
		getCaptcha(user);
		model.addAttribute("user", user);
		}
		return "registerUser";
	}
	
	@GetMapping("/allUsers")
	public String getAllUsers(Model model) {
		List<User> userList= service.getAllUsers();
		model.addAttribute("userList", userList);
		return "listUsers";
	}
	
	private void getCaptcha(User user) {
		Captcha captcha = CaptchaUtil.createcaptcha(240, 70);
		user.setHiddencataptch(captcha.getAnswer());
		user.setCaptcha(""); // value entered by the User
		user.setRealcaptcha(CaptchaUtil.encodeCaptcha(captcha));
		
	}
	
	
}