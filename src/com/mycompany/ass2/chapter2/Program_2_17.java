/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Gio
 *
 */
import java.util.Scanner;
public class Program_2_17 {
	
	public static void main(String[] args)
	 {
	 Scanner input = new Scanner(System.in);
		
	 int number1; 
	 int number2; 
	 int number3;
	 int sum;
	 int product;
	 int average;
	 
	 System.out.print("Enter first integer: "); 
	 number1 = input.nextInt(); 
	 System.out.print("Enter second integer: ");
	 number2 = input.nextInt();
	 System.out.print("Enter third integer: ");
	 number3 = input.nextInt();
	 //Largest
	 if ((number1 > number2)&&(number1 > number3))
		 System.out.printf("%d is the largest number\n",number1);
	 
	 if ((number2 > number1)&&(number2 > number3))
		 System.out.printf("%d is the largest number\n", number2);
	    
	 if ((number3 > number1)&&(number3 > number2))
	      System.out.printf("%d is the largest number\n", number3);
	 //Smallest
	 if ((number1 < number2)&&(number1 < number3))
		 System.out.printf("%d is the smallest number\n",number1);
	 
	 if ((number2 < number1)&&(number2 < number3))
		 System.out.printf("%d is the smallest number\n", number2);
	    
	 if ((number3 < number1)&&(number3 < number2))
	      System.out.printf("%d is the smallest number\n", number3);
	     //Sum and Product and avg
	sum = number1 + number2 + number3; 
	product = number1 * number2 * number3;
	System.out.printf("Sum is %d%n", sum); 
	System.out.printf("Product is %d%n", product); 
	System.out.println("Average is " + ((number1 + number2 + number3) /3));
	 }
}