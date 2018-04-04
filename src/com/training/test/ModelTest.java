package com.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Student;

public class ModelTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s1 = ac.getBean(Student.class, "student");
		Student s2 = ac.getBean(Student.class, "student");

		System.out.println(s1 == s2);
	}

}
