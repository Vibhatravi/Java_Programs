package com.example.program1;

public class Customer {
	String name, address;
	Ticket tick;
	
	public Customer(String name, String address, Ticket tick) {
		this.name = name;
		this.address = address;
		this.tick = tick;
	}
	
	public Ticket getTick() {
		return tick;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}

