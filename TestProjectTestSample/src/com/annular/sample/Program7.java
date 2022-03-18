package com.annular.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Program7 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>(); 
		a.add("java");  
		a.add("Amit"); 
		a.add("j2ee");  
		a.add("selenium");
		a.add("springboots");  
		a.add("springboots");  
		a.add("code3");  
		a.add("code3");  
		a.add("Ayush");  
		a.add("java");  
		a.add("springboots");  
		a.add("Garima"); 
//		
//		Iterator<String> itr=a.iterator();  
//		while(itr.hasNext())//while
//		 {  
//		System.out.println(itr.next());  
//		 }
		

		for(String word:a)// for loop 2nd type
		 {	
			System.out.println(word);
		 } 

	}

}
