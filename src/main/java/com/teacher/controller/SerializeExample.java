package com.teacher.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.hibernate.validator.constraints.URL;

import com.teacher.model.Person;

import jdk.internal.org.jline.utils.Log;


/**
 * @author rabi
 * {@link https://medium.com/geekculture/the-mistake-often-forgotten-in-java-serializable-9c02b2b5f3fa}
 */
public class SerializeExample {
	private final static String filepath="C:\\Users\\rabi\\Desktop\\Person.ser";
	
	public static void main(String[] args) {
//		serealize();
		deserealize();
	}
	
	public static void serealize() {
		Person p=new Person();
		p.setName("rabi");
		p.setGender("male");
		try {
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(filepath));
			os.writeObject(p);
			System.out.println("serialization is done");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void deserealize() {
//		Person p=new Person();
//		p.setName("rabi");
//		p.setGender("male");
		try {
			ObjectInputStream io=new ObjectInputStream(new FileInputStream(filepath));
			Person i_p=(Person)io.readObject();
			System.out.println(i_p.getName());
			System.out.println(i_p);
			System.out.println("deserialization is done");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
