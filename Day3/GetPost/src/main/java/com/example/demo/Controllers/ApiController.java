package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Service.ApiService;
import com.example.demo.repositories.EmployeeRepo;

@RestController
public class ApiController {
@Autowired
 EmployeeRepo rep;
@Autowired
 ApiService ser;
@GetMapping("/")
List<Employee> theGet()
{
 return rep.findAll();
}
@GetMapping("/{id}")
public Optional<Employee> theGetVal(@PathVariable int id)
{
	return ser.check(id);
}
@PostMapping("/")
public Employee posting(@RequestBody Employee emp) 
{
	return rep.save(emp);
}
}
