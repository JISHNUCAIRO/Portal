package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
@Autowired
StudentRepo rep;
@Autowired
ApiService ser;
@PostMapping("/")
public Student thePost(@RequestBody Student stu) 
{  
  return rep.save(stu);	
}
@GetMapping("/")
List<Student> theGet()
{
  return rep.findAll();	
}
@GetMapping("{id}")
public Optional<Student> theGetVal(@PathVariable int id)
{
  return ser.get(id);	
}
@DeleteMapping("/")
public String theDelete(@RequestParam int id) 
{
   	return ser.delete(id);
}
//@PutMapping("/{id}")
//public String thePut(@RequestBody Student stu) 
//{
//  return ser.update(stu);	
//}

}
