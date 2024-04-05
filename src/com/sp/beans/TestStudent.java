package com.sp.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestStudent {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("/com/sp/resources/applicationContext.xml");
		
		BeanFactory container = new XmlBeanFactory(resource);
		
		Student std = (Student) container.getBean("stdObj");
		
		std.display();
		
		System.out.println(std.getName());
		System.out.println(std.getRollno());
		
	}
	
	
	
}
