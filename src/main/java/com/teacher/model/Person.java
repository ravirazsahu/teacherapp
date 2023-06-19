package com.teacher.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5539588456333414533L;
	private String name;
	private String gender;
	private String mobno;
	private String phno;
	private String address;

}
