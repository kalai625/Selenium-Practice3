package com.annular.sample;

public class Program2 
{

	public static void main(String[] args)
	{
		System.out.println("main method starts");
		// non static to create object for class and then call by method
	Delta obj=new Delta();
	obj.test();
	System.out.println(obj.a);
	
	//static call by class name
	System.out.println("Enemy");
	Game.exam();
	 System.out.println("hai main method ends");
		}
}
	class Friend
	{
		//non static class 1
		int a=10;
	    void test()
		{
			  System.out.println("hi delta");	
		}
	    
	}
	class Enemy
	{
		//static class 2
				static int b=20;
				static void exam()
				{
				  System.out.println("hi game");	
				}
	}


