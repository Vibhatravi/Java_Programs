package com.example.program1;

public class Ticket {
	int ticno,price,seatno;
	String ticktype;
	
	public Ticket(int ticno, int price, int seatno, String ticktype) {
		this.ticno = ticno;
		this.price = price;
		this.seatno = seatno;
		this.ticktype = ticktype;
	}
	
	public int getTicno() {
		return ticno;
	}

	public int getPrice() {
		return price;
	}

	public int getSeatno() {
		return seatno;
	}

	public String getTicktype() {
		return ticktype;
	}
}
