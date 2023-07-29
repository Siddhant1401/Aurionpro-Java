package com.aurionpro.test; 
 
import java.util.List; 
import java.util.ArrayList; 
 
public class ListTest { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
   
  //ArrayList<Integer> numbers = new ArrayList<Integer>(); 
  List<Integer> numbers = new ArrayList<Integer>(); 
  /* Any type of values can be store here 
     List anytype = new ArrayList<>(); 
   */ 
   
  numbers.add(10); 
  numbers.add(20); 
  numbers.add(30); 
  numbers.add(40); 
  numbers.add(50); 
   
  System.out.println(numbers.size()); 
  System.out.println(numbers); 
  System.out.println(numbers.contains(60)); 
  System.out.println(numbers.contains(10)); 
  System.out.println(numbers); 
  // ERROR numbers.remove(10); 
  //numbers.remove( new Integer(10)); 
  numbers.remove(0); 
  System.out.println(numbers); 
   
  numbers.clear(); 
  System.out.println(numbers); 
   
   
   
 
 } 
 
}