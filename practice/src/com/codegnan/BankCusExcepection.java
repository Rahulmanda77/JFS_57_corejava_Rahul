package com.codegnan;

class InsufficientBalanceException extends Exception{
	 InsufficientBalanceException(String message){
		 super(message);
	 }
}

public class BankCusExcepection {

	public static void main(String [] args) throws  InsufficientBalanceException {
		double balance=50000.33;
		double withdraw=3000.00;
		try {
			if(withdraw>balance) {
				throw new  InsufficientBalanceException("Invalid amoungt");
			}
			System.out.println("Withdraw successful");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
