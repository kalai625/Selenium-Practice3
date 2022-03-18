package com.annular.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Program10 {
  public static void main(String[] args) {
  
   
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
  
   
    Iterator<String> it = cars.iterator();
    for(String var:cars)
    {
    System.out.println(var);
  
    }
    System.out.println(it.next());
  }
}
