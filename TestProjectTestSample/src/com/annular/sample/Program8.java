package com.annular.sample;

public class Program8 
{

	public static void main(String[] args) 
	{
		
		System.out.println(Program8.method1(10, 20));
		System.out.println(Program8.method1(1, 2, 3));
		Program8 duke=new Program8();
		System.out.println(duke.method1(64.0f, 850.7f, 7.0f));
		System.out.println(duke.method1(12.1, 12.30, 12.2));
	}
	public static int method1(int a, int b) 
	{
		
		return a+b;
	}
	public static int method1(int a ,int b, int c) 
	{
		return a+b+c;
	}
	public float method1(float d,float e,float f)
	{
		return  d+e+f;
	}
	public double method1(double s, double h, double o)
	{
		return s+h+o;
	}
	
}
	

