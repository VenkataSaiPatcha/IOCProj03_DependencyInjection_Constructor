package com.sai.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sai.sbean.WishMessageGenerator;

public class MainMethodOfConstructorInjection 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("D:/Spring&SpringBootPrograms/IOCProj03_DependencyInjection_Constructor/src/com/sai/config/applicationContext.xml");
			WishMessageGenerator message=(WishMessageGenerator)ctx.getBean("wmg");
			String name=message.showWishMessage("Sai");
			System.out.println(name);
			ctx.close();
	}

}
