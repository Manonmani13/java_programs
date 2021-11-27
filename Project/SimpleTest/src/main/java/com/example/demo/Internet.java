package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Internet {
private String internet;
private int speed;

public String getInternet() {
	return internet;
}
public void setInternet(String internet) {
	this.internet = internet;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public void pv()
{
	System.out.println("provide internet");
}
}
