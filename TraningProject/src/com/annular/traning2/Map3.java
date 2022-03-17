package com.annular.traning2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map3 
{

	public static void main(String[] args)
	{
		HashMap<Integer, String> obj = new HashMap<Integer,String>();
		obj.put(1, "kalai");
		obj.put(3, "Ajith");
		obj.put(4, "ganeshwar");
		obj.put(3, "ofice");
		
		
//		Iterator<Integer,String> itr = obj
		
//		Iterator<Integer,String>=new iterator();
		
		for (Map.Entry obj2:obj.entrySet())
		{
			System.out.println(obj2.getKey() +" "+obj2.getValue());
		}
		
		obj.put(2,"lap");
		
		System.out.println("    ");
		
		for (Map.Entry obj2:obj.entrySet())
		{
			System.out.println(obj2.getKey() +" "+obj2.getValue());
		}
	}
}