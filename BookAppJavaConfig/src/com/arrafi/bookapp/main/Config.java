package com.arrafi.bookapp.main;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.arrafi.bookapp.book.*;


@Configuration
@PropertySource("classpath:book.Properties")
public class Config {
	
	@Bean
	public Book DiscreteMathematic(
			@Value("${book1.id}")int id,
			 @Value("${book1.name}")String name,
			 @Value("${book1.author}") String author,
			 @Value("${book1.year}") int year
			 )  
	{
		
		DiscreteMathematic matematikaDiskrit = new DiscreteMathematic(id,name,author,year);
		return matematikaDiskrit;
	}
	
	@Bean
	public Book ApiTauhid(
			@Value("${book2.id}")int id,
			 @Value("${book2.name}")String name,
			 @Value("${book2.author}") String author,
			 @Value("${book2.year}") int year
			 ) 
	{		
		
		ApiTauhid buku2 = new ApiTauhid(id,name,author,year);
		return buku2;
	}
}