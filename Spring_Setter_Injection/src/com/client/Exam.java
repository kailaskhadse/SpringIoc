package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("com/util/bean.xml");
		Student k = a.getBean("Stu",Student.class);
         k.display();
         
	}

}
