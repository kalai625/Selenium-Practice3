package com.annular.twenty;

public class A13_PyramidPattern  
{  
     public static void main(String ar[])  
    {  
      
          int rows = 5 ;
             int rowCount = 1;  


          for (int i = rows; i > 0; i--)  
        {  
             for (int j = 1; j <= i; j++)  
            {  
                System.out.print(" ");  
            }  

            for (int j = 1; j <= rowCount; j++)  
            {  
                System.out.print(rowCount+" ");  
            }  
               System.out.println();  
             rowCount++;  
        }  
    }  
}  
