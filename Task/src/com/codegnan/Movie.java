package com.codegnan;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movieticket m=new Movieticket();
		m.MovieName("Pushpa 2");
		m.TicketId(123);
		m.Price(200);
		m.Persons(1);
		System.out.println("Movie name: " +m.MovieName());
		System.out.println("Ticket Id: " +m.TicketId());
		System.out.println("Price: " +m.Price());
		System.out.println("Persons: " +m.Persons());
		

	}

}
