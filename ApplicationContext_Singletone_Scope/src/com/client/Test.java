package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext ap= new ClassPathXmlApplicationContext("com/Utility/bean.xml");
   Student st= ap.getBean("Stu", Student.class);
   Student st1= ap.getBean("Stu", Student.class);
  System.out.println(st);   //com.model.Student@68267da0
  System.out.println(st1); //com.model.Student@68267da0
  
		
	
	}

}
