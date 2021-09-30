package com.example.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.springJdbc.dao.StudentDao;
import com.example.springJdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String [] args) {
		System.out.println("program started");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/example/springJdbc/config.xml");
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		//Insert
//		Student student=new Student();
//		student.setId(4);
//		student.setName("raman");
//		student.setCity("ghaziabad");
//		
//		int result=studentDao.insert(student); 
//		System.out.println("student added "+result);
		
		//update
		Student student=new Student();
		student.setId(4);
		student.setName("raman");
     	student.setCity("Ghaziabad");
     	
     	int result=studentDao.change(student); 
		System.out.println("student updated "+result);
		
		//delete
//		int result=studentDao.delete(1);
//		System.out.println("student deleted "+result);
		
		
		
	}
}
