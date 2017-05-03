/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Gio
 *
 */
public class Program_5_18 {

	
	public static void main(String[] args) {
		 int amount; 
		 int principal = 1000; 
		 int rate = 5/100; 
		
		 
		  System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		    
		   for (int year = 1; year <= 10; ++year)
		   
		{
		   
		
		    
		amount = principal * Math.pow(1 + rate, year);
		      
		   
		System.out.printf("%4d%,20.2f%n", year, amount);
		   
		 }
	}
}

