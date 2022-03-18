package com.annular.sample;

import java.util.*;

public class TestJavaCollection3
{  
public static void main(String args[])
    {  
ArrayList<String> a=new ArrayList<String>(); 
a.add("Ayush");  
a.add("Amit"); 
a.add("Ashish");  
a.add("Garima");
a.add("hai1");  
a.add("hai2");  
a.add("code3");  
a.add("code3");  
a.add("Ayush");  
a.add("Amit");  
a.add("Ashish");  
a.add("Garima"); 
a.set(0, "Opel");//replace value array list
Iterator<String> itr=a.iterator();  
while(itr.hasNext())//while
 {  
System.out.println(itr.next());  
 }
System.out.println(a.get(4));//index print
System.out.println(a.size());//size

//fdd
for(String word:a)// for loop 2nd type
 {	
	System.out.println(word);
 } 



}  
}  