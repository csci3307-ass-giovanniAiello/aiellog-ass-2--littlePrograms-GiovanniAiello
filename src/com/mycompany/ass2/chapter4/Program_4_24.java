/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author Gio
 *
 */
import java.util.Scanner;
public class Program_4_24 {
	
	 public static void main(String[] args)
	{
	 
	 Scanner input = new Scanner(System.in);
	
	   
	
	  int passes = 0;
	   
	int failures = 0;
	   
	int studentCounter = 1;
	
	 while (studentCounter <= 10)
	 {
	
	 System.out.print("Enter result (1 = pass, 2 = fail): ");
	 int result = input.nextInt();
	
	   if (result == 1)
	   
	passes = passes + 1;
	   
	else
	   
	failures = failures + 1;
	 }
}
}
