/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Gio
 *
 */
import java.util.Scanner;
public class Program_2_6 {
	 public static void main(String[] args) {

		 
		 Scanner input = new Scanner(System.in);

		 int a; 
		 int b; 
		 int c; 
		 int ans; 

		 System.out.print("Enter first integer: "); 
		 a = input.nextInt(); 

		 System.out.print("Enter second integer: "); 
		 b = input.nextInt(); 

		 System.out.print("Enter third integer: "); 
		 c = input.nextInt(); 

		 ans = a * b * c;
		 System.out.printf("Product is %d%n", ans);
		 } 

} 
