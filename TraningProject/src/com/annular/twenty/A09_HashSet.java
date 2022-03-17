package com.annular.twenty;

import java.util.HashSet;
import java.util.Iterator;

public class A09_HashSet 
{

	public static void main(String[] args)
	{
		HashSet<String> al=new HashSet<String>();  
		al.add("name1");  
		al.add("name2"); 
		al.add("name3");
		al.add("name4"); 
		
		al.add("zame5");
		al.add("name3"); 
		 
		
		Iterator itr=al.iterator(); 
		
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		} 

	}

}
