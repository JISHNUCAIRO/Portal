package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Integer>{

	public List<Car> findNameByOwners(int owners);
	public List<Car> findNameByAddress(String address);
	public List<Car> findNameByCarName(String carName);
	public List<Car> findNameByOwnersAndCarType(int owners,String carType);
	
}
