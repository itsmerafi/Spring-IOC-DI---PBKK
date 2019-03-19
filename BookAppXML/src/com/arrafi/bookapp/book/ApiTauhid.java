package com.arrafi.bookapp.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class ApiTauhid implements Book{

	private int id;
	private String name;
	private String author;
	private int year;
	
	
	public ApiTauhid() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public ApiTauhid(@Value("${book2.id}")int id,
					 @Value("${book2.name}")String name,
					 @Value("${book2.author}") String author,
					 @Value("${book2.year}") int year
					 ) 
	{		
		super();
		this.setId(id);
		this.setName(name);
		this.setAuthor(author);
		this.setYear(year);
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Nama=" + name + "\tAuthor=" + author + "\tYear=" + year ;
	}

	

}
