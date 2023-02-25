package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Book;
import com.example.demo.Repositories.BookRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
@Autowired 
BookRepo rep;
@Autowired
ApiService ser;

@PostMapping("/")
public Book thePost(@RequestBody Book bo) 
{
	return rep.save(bo);
}
@GetMapping("{id}")
public Optional<Book> theGetVal(@PathVariable int id)
{
  return ser.get(id);
}
@GetMapping("/")
List<Book> theGet()
{
  return rep.findAll();	
}
@DeleteMapping("/")
public String theDel(@RequestParam int id) 
{
  return ser.del(id);	
}
}
