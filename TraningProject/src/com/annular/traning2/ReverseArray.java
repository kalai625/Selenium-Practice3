package com.annular.traning2;

import java.util.Scanner;

public class ReverseArray 
{  
    public static void main(String[] args) 
    {  
       
    

	    int a[]=new int[5];
        Scanner scn4=new Scanner(System.in);
        System.out.println("enter");
  
        for (int i = 0; i < a.length; i++)
        {  
        	a[i]=scn4.nextInt();

        }  
      
        
        System.out.println("reverse");
        
        
        for (int i = a.length-1; i >= 0; i--)
        {  
            System.out.println(a[i] );  
        }
        
        
    }  
}  
