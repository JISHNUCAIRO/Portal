package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Car;
import com.example.demo.repository.CarRepo;

@Service
public class ApiService {
@Autowired
CarRepo rep;

public List<Car> ownSer(int own)
{
 return rep.findNameByOwners(own);	
}
public List<Car> addressSer(String address)
{
 return rep.findNameByAddress(address);	
}
public List<Car> carNameSer(String carname)
{
 return rep.findNameByCarName(carname);	
}
public List<Car> ownerAndCarType(int owners,String carType)
{
 return rep.findNameByOwnersAndCarType(owners, carType);	
}
}
