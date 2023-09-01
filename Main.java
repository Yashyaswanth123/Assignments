package com.training.basic;

public class Main {

	public static void main(String[] args) {
		Book book1=new Book("Yash","Kumar",2600);
		book1.getDetails();
		book1.checkBook();
		System.out.println();
		Book book2=new Book("Gopi","Ram",6700);
		book2.getDetails();
		book2.checkBook();
		

	}

}
