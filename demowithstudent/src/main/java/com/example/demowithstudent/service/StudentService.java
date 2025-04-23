package com.example.demowithstudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demowithstudent.model.*;
import com.example.demowithstudent.dao.*;
@Service

public class StudentService {
	@Autowired
	StudentResp ob;
	
	//save
	public void savefile(Student s) {
		ob.save(s);
	}
	
	//full Select
	
	 public List<Student>get1()
	 { 
		 return ob.findAll();
	 }

}
