package com.annular.sample;

public class Program1 
{
	public static void main(String[] args)
	{
	System.out.println("main method starts");
	Delta obj=new Delta();
	obj.test();
	System.out.println(obj.a);
	System.out.println("Game.a");
	Game.exam();
	System.out.println("hai main method ends");
	}
}
class Delta
{
	int a=10;
    void test()
	{
    System.out.println("hi delta");	
	}
	    
}
class Game
{
	static int b=20;
	static void exam()
	{
		System.out.println("hi game");	
	}
}


