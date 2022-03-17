package com.annular.twenty;

import java.util.HashMap;

public class A11_12_HashMap
{

	public static void main(String[] args) 
	{
		
		 //Program 11 *************************************************************************************
		 HashMap <Integer, String>map =new HashMap<Integer,String>();
		 map.put(1, "kalai");
		 map.put(2, "kowsik");
		 map.put(4, "sis");
		 map.put(3, "amma");
		 map.put(4, "appa");
		 
		 
		 for ( Integer i:map.keySet()) 
		 {
			System.out.println(i+"  "+map.get(i));	
		  }
		 
		 map.put(5, "hello");
		 map.put(4, "reset");
		
		 
		System.out.println("add*****************");
		
		
		 for ( Integer i:map.keySet())              
		 { 
			System.out.println(i+" "+map.get(i));  
		 } 
		 
			System.out.println("remove********************");
			
		 map.remove(3,"c");
		
		 for ( Integer i:map.keySet()) 
		 { 
			System.out.println(i+" "+map.get(i));  
		 } 
		 
		 System.out.println("//12");
		 
		 //Program 12 *************************************************************************************
		 
		

	}

}
