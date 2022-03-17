package com.annular.traning2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSet1
{

	public static void main(String[] args)
	{
		 
		HashSet<String> al=new HashSet<String>();  
		al.add("name1");  
		al.add("name2"); 
		al.add("name3");
		al.add("name4"); 
		
		al.add("name3"); 
		al.add("zame3"); 		
		Iterator itr=al.iterator(); 
		
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		} 
		 
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext())
//		{  
//		System.out.println(itr.next());  
//		} 
//		  
//		}  
	}
}
// not allowing duplicate and no inertion order 