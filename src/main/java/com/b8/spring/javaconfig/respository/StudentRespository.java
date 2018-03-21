package com.b8.spring.javaconfig.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.b8.spring.javaconfig.model.Student;

@Component
public class StudentRespository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void persistStudentData(Student student){
		
		System.out.println("Persisted student data.");
	}

}
