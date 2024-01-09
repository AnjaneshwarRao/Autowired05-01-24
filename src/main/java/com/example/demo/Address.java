package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("Address")
public class Address {
private int zipcode;
public Address(int zipcode, String area, int flatnum) {
	super();
	this.zipcode = zipcode;
	this.area = area;
	this.flatnum = flatnum;
	
	System.out.print("this is from address class");
}
public Address() {
	System.out.println("this is from the Address class of empty constructor");
}
private String area;
private  int flatnum;
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public int getFlatnum() {
	return flatnum;
}
public void setFlatnum(int flatnum) {
	this.flatnum = flatnum;
}

}
