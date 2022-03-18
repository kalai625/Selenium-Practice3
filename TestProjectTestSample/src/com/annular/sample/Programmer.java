package com.annular.sample;

class Studentss
{
	long log=789999999l;
}




class Employees extends  Studentss
{  
	 float salary=40000;  
}  
public class Programmer extends Employees
	{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println(p.salary);  
	   System.out.println(p.bonus);  
	}  
}  