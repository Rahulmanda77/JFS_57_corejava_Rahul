package com.codegnan;

class AgeNotValidException extends Exception {
	AgeNotValidException(String msg){
		super(msg);
	}
}
class Human{
	int age;
	Human(int age){
		this.age=age;
	}

void EnterAge() throws Exception {
	if(age>100) {
	throw new AgeNotValidException("Age not valid");
	}else {
		System.out.println("Age valid");
	}
}	
}
 public class Main2{
	 public static void main(String[] args) {
		 Human h=new Human(133);
		 try {
			 h.EnterAge();
		 } catch(Exception e){
			 System.out.println(e.getMessage());
		 }
	 }
 }
