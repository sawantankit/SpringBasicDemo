package org.ankit.java;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
//		Triangle triangle = new Triangle();
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
//		Triangle obj = (Triangle) factory.getBean("triangle");
//		obj.draw();


		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle obj = (Triangle) context.getBean("triangle");
        obj.draw();
	
	

	}

}
