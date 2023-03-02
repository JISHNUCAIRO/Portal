package com.example.demo.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Child;
@Repository
public interface ChildRepo extends JpaRepository<Child,Integer>{
	
	@Query("SELECT c.babyId from Child c")
	public Page<Child> findByBabyId(PageRequest pageRequest);
	
	@Query("SELECT C.babyFirstName from Child C")
	public Page<Child> findByBabyFirstName(PageRequest pageRequest);
	
	@Query("select babyLastName from Child")
	public Page<Child> findByBabyLastName(PageRequest pageRequest); 
	
	@Query("select motherName from Child")
	public Page<Child> findByMotherName(PageRequest pageRequest); 
	
	@Query("select fatherName from Child")
	public Page<Child> findByFatherName(PageRequest pageRequest); 
	
	@Query("select address from Child")
	public Page<Child> findByAddress(PageRequest pageRequest); 
	
}
