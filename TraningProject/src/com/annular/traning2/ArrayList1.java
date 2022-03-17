package com.annular.traning2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1
{
	private static String name;

	public static void main(String[] args)
	{
	 ArrayList<String> list=new ArrayList<String>();   
			     
	 list.add("name1");    
     list.add("name2");
     list.add("name4"); 
     list.add("name3");    
	 list.add("name4"); 
	
	 
	 Iterator<String> itr=list.iterator();
			while (itr.hasNext()) 
			{
				System.out.println(itr.next());
				name=itr.next();
				
				if(name=="kalai")
				{
					System.out.println("name is exisit  "+name);
				}
				else
				{
					System.out.println("name is  not exisit  "+name);
				}
				
			}
			       
	
			
		
		
		


	}
}