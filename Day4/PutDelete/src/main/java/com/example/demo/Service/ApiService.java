package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;

@Service
public class ApiService {
@Autowired
StudentRepo rep;
public Optional<Student> get(int id)
{
	return rep.findById(id);
}

public String delete(int id) 
{
    rep.deleteById(id);
    return "deleted";
}
//public Optional<Student> update(int id)
//{
//	int p=rep.findById(id);
//   
//    return "Updated";
//}
}
