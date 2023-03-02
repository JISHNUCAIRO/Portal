package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.ChildRepo;
import com.example.demo.Services.ApiService;

@RestController
public class ApiController {
@Autowired
ChildRepo rep;
@Autowired 
ApiService ser;

@PostMapping("/")
public Child thePost(@RequestBody Child c) 
{
 return rep.save(c);	
}
@GetMapping("{id}")
public Optional<Child> theGetval(@PathVariable int id)
{
  return ser.get(id);	
}
@GetMapping("/{offset}/{pageSize}")
public List<Child> theGetOff(@PathVariable int offset,@PathVariable int pageSize)
{
	return ser.setPage(offset,pageSize);
}
@GetMapping("/{offset}/{pageSize}/{field}")
public List<Child> theGetOffField(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
{
	if(field.equals("babyId"))
     	return ser.setPageBabyId(offset,pageSize);
	else if(field.equals("babyFirstName"))
		return ser.setPageBabyFirstName(offset, pageSize);
	else if(field.equals("babyLastName"))
		 return ser.setPageBabyLastName(offset, pageSize);
	else if(field.equals("MotherName"))
		return ser.setPageMotherName(offset, pageSize);
	else if(field.equals("FatherName"))
		return ser.setPageFatherName(offset, pageSize);
	else if(field.equals("address"))
		return ser.setPageAddress(offset, pageSize);
	return null;
}

}
