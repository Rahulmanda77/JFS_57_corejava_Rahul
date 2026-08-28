package com.codegnan;

public class Movieticket {
	
	private String MovieName;
	private int TicketId;
	private int Price;
	private int Persons;
	
	public void MovieName(String MovieName) {
		this.MovieName=MovieName;
	}
	public String MovieName() {
		return MovieName;
	}
	public void TicketId(int TicketId) {
		this.TicketId=TicketId;
	}
	public int TicketId() {
		return TicketId;
	}
	public void Price(int Price) {
		this.Price=Price;
	}
	public int Price() {
		return Price;
	}
	public void Persons(int Persons) {
		this.Persons=Persons;
	}
	public int Persons() {
		return Persons;
	}

}
