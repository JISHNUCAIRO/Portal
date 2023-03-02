package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
@Id
private int id;
private String carName;
private String carType;
private int owners;
private String currentOwnerName;
private long mobile;
private String address;
public Car(int id, String carName, String carType, int owners, String currentOwnerName, long mobile, String address) {
	super();
	this.id = id;
	this.carName = carName;
	this.carType = carType;
	this.owners = owners;
	this.currentOwnerName = currentOwnerName;
	this.mobile = mobile;
	this.address = address;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public String getCarType() {
	return carType;
}

public void setCarType(String carType) {
	this.carType = carType;
}

public int getOwners() {
	return owners;
}

public void setOwners(int owners) {
	this.owners = owners;
}

public String getCurrentOwnerName() {
	return currentOwnerName;
}

public void setCurrentOwnerName(String currentOwnerName) {
	this.currentOwnerName = currentOwnerName;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Car() {
	super();
}
}
