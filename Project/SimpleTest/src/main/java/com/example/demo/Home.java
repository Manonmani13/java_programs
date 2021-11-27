package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {
private String street;
private int doorno;
@Autowired
private Internet modem;

public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getDoorno() {
	return doorno;
}
public void setDoorno(int doorno) {
	this.doorno = doorno;
}
public void useInternet()
{
	modem.pv();
	System.out.println("Connected");
}
}
