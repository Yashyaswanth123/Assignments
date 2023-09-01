package com.training.basic;

public class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void getDetails()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);

	}
	void checkBook()
	{
		if(price>950)
		{
			System.out.println("Non-Affrodable");
		}
		else
		{
			System.out.println("Affrordable");
		}
	}

}



