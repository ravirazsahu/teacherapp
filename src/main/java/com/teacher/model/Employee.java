package com.teacher.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="employee")
@Getter
@Setter
public class Employee {
@Id	
private Long id;
private String firstname;
private String lastname;
private String address;
private String zipcode;
private String city;
private String country;


}
