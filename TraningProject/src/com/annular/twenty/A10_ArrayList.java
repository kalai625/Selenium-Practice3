package com.annular.twenty;

import java.util.ArrayList;
import java.util.Iterator;


public class A10_ArrayList
{
		public static void main(String[] args)
		{
		 ArrayList<String> list=new ArrayList<String>();   
				     
		 list.add("name1");    
	     list.add("name2");
	     list.add("name4"); 
	     list.add("name3");    
		 list.add("name4"); 
	
//		 Iterator<String> itr=list.iterator();
//
//				while (itr.hasNext()) 
//				{
//					System.out.println(itr.next());
//				}
				
			if(list.contains("kalai"))	
			{
				System.out.println("array string is present");
			}
			else
			{
				System.out.println("array string is  not present");
			}
			if(list.contains("name3"))	
			{
				System.out.println("array string is present");
			}
			else
			{
				System.out.println("array string is  not present");
			}
				
	
	     }	
}
