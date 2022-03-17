package com.annular.traning;

public class ProgramLogic 
{
	static int a=6;
	public static void main(String[] args) 
	{
	System.out.println("program starts");
	ProgramLogic.method3();	
	System.out.println("program ends");
				
	}
	public static void method3() 	{
		
	 for(int i=0;i<a;i++) {
		if(a<5){
			System.out.println("a is less than 5" );
		}
		else if(a==5){
			System.out.println( " a is less than 5 "   );
		}
		else if (a>5){
			System.out.println( " a is greater than 5    ");
			}
			else{
				System.out.println("null statement");
				
			}
	 }
	 
 }
		
}



