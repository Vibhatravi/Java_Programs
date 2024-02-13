package com.example.demoJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	
	public List<Student> display(){
		return sr.findAll();
	}
	
	public void insert(int id, String name, String address) {
		Student s= new Student();
		s.setId(0);
		s.setName(name);
		s.setAddress(address);
		sr.save(s);
	}
	}
