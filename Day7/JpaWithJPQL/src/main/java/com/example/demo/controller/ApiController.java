package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ApiService;
import com.example.demo.models.Car;
import com.example.demo.repository.CarRepo;

@RestController
public class ApiController {
@Autowired
ApiService ser;
@Autowired
CarRepo rep;
@PostMapping("/")
public Car thePost(@RequestBody Car c)
{
   return rep.save(c);	
}
@GetMapping("/owners/{owners}")
public List<Car> theOwner(@PathVariable int owners)
{
  return ser.ownSer(owners);	
}
@GetMapping("/address/{address}")
public List<Car> theAddress(@PathVariable String address)
{
  return ser.addressSer(address);	
}
@GetMapping("/carname/{carname}")
public List<Car> theCarName(@PathVariable String carname)
{
  return ser.carNameSer(carname);	
}
@GetMapping("/owners/{owners}/cartype/{cartype}")
public List<Car> theOwnersAndCarType(@PathVariable int owners,@PathVariable String cartype)
{
  return ser.ownerAndCarType(owners, cartype);	
}
}
