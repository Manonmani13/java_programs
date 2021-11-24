package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {
	public Home()
	{
		System.out.println("Welcome");
	}
	private String name;
	private int doorno;
	@Autowired
	private InternetConnection modem;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
public void connect()
{
	modem.swithcon();
	System.out.println("connented ");
}

}
