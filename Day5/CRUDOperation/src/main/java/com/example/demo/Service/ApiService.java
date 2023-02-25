package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Book;
import com.example.demo.Repositories.BookRepo;

@Service
public class ApiService {
@Autowired
BookRepo rep;

public Optional<Book> get(int id)
{
	return rep.findById(id);
}
public String del(int id) 
{
  rep.deleteById(id);	
  return "Deleted";
}
}
