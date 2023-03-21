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
		Resource r=new ClassPathResource("com/Utility/bean.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Student s=bf.getBean("Stu", Student.class);
		s.display();
		
	
	}

}
