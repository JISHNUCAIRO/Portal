package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
