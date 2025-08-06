package com.sai.sbean;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator 
{
	private LocalTime lTime;
	private LocalDate lDate;
	
	public WishMessageGenerator(LocalTime time, LocalDate date)
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
		this.lTime=time;
		this.lDate=date;
	}
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()"+"Time :"+lTime+" "+"Date :"+lDate);
		int hour=lTime.getHour();
		if(hour<12)
			return "Good Morning :"+user;
		else if(hour<15)
			return "Good Afternoon :"+user;
		else if (hour<18)
			return "Good Evening :"+user;
		else
			return "Good Night :"+user;
	}
}
