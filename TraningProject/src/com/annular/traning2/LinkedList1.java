package com.annular.traning2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1
{

	public static void main(String[] args)
	{
		 
		LinkedList<String> al=new LinkedList<String>();  
		al.add("name1");  
		al.add("name2"); 
		al.add("name3");
		al.add("name4"); 
		al.add("name5");
		al.remove("name3");
		al.add("name6"); 
		al.add("name7");
		al.add("name7"); 
		 
		Iterator itr=al.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		} 
		  
		}  

}
