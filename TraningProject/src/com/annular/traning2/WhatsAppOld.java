package com.annular.traning2;

public class WhatsAppOld extends WhatsApp  
{   
	
	@Override
     public void Method11()
	   {
	      System.out.println("whats app only chat");
	   }
}



 class WhatsApp extends WhatsAppNew
	{
	   @Override
	   public void Method11()
	   {
	      System.out.println("chat and calls ");
	   }
	}


 class WhatsAppNew
{
	 
	 public void Method11()
	   {
	      System.out.println("added extra status future and cahts and calls ");
	   }
}
	
