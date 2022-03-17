package com.annular.traning;

public class Program13 
{

	public static void main(String[] args)
	{
    int num1=10 , num2=20 , num3=30; 
    String month="jan";
    String month1="feb";
    String month3="mar";
    
    if(num1>num2 && num1>num3)
    {
    	System.out.println(num1);
    }
    else if(num2>num1 && num2>num3)
    {
    	System.out.println(num2);
    }
    else 
    {
    	
     System.out.println(num3);
	}
    
    
    switch(month3)
    {
    case "jan": System.out.println(" print1");
    break;
    case "feb": System.out.println(" print2");
    break;
    case "mar": System.out.println(" num is 30");
    break;
    default : System.out.println("none number");
    
    }
    //num
    switch(num2)
    {
    case 10: System.out.println(" "+num1);
    break;
    case 20: System.out.println(" "+num2);
    break;
    case 30: System.out.println(" num is 30");
    break;
    default : System.out.println("none number");
    
    }
    
    

    
}
}

	
