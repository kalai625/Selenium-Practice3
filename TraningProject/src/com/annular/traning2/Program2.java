package com.annular.traning2;

public class Program2
{
    protected static int val=56;
       public static  int b=34;
      static int hav=568;
    
    protected static int c=val+b;
    
    protected static int  str2=  c;
    
	protected static void method2() 
	{
		System.out.println("method");
		
		
		System.out.println(Program2.hav);
		
		
		System.out.println(str2);
		
	} 
	
	private String Name;
	private String Address;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getAddress() 
	{
		return Address;
	}
	public void setAddress(String address)
	{
		Address = address;
	}
	
	
}