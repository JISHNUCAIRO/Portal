package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.repositories.EmployeeRepo;

@Service
public class ApiService {
@Autowired
 EmployeeRepo rep;
public Optional<Employee> check(int id)
{
  return rep.findById(id);	
}
}
