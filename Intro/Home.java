package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {
	private String name;
	private int doorno;
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
	System.out.println("connented ");
}

}
