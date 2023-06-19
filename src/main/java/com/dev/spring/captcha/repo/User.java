package com.dev.spring.captcha.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;


@Data
@Entity
//@Table(name="captchauser")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	
	@Transient
	private String captcha;
	
	@Transient
	private String hiddencataptch;
	
	@Transient
	private String realcaptcha;
	

}
