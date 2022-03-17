package com.annular.pattern;

public class Duplicate
{

	public static void main(String[] args)
	{
		String str = "kalaiyarasan";
		
		
	      char[] a = str.toCharArray();
	           
	      
	     
	      for (int i = 0; i < str.length(); i++)
	      {
	         for (int j = i + 1; j < str.length(); j++)
	         {
	            if (a[i] == a[j]) 
	            {
	               System.out.print(a[j] + " ");
	               break;
	            }
//	            else
//	            {
//	            	System.out.println();
//	            }
	         }
	      }

	}

}
