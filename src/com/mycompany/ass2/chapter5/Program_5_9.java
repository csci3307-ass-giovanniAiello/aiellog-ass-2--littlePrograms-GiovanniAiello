/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Gio
 *
 */
import java.util.Scanner;
public class Program_5_9 {
	public static void main(String[] args){
		int total = 0; 
		    
		int gradeCounter = 0; 
		    
		 
		int aCount = 0; 
		  int bCount = 0;
		  int cCount = 0; 
		    
		int dCount = 0; 
		   int fCount = 0; 
		 
		 Scanner input = new Scanner(System.in);
		
		 System.out.printf("%s%n%s%n %s%n %s%n",
		 "Enter the integer grades in the range 0-100.",
		 "Type the end-of-file indicator to terminate input:",
		 "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
		 "On Windows type <Ctrl> z then press Enter"); 
		 
		  while (input.hasNext())
		 {
		 int grade = input.nextInt(); 
		 total += grade; 
		 ++gradeCounter; 
		
		  
		switch (grade / 10)
		 
		{
		 case 9:  
		case 10: 
		++aCount;  
		break; 
		
		case 8: 
		  
		
		++bCount;
	    break; 
		   
		  case 7: 
		  
		++cCount;
		  
		break; 
		   
		  case 6: 
		  
		++dCount;
		  
		break; 
		  
		   
		default: 
		   ++fCount;
		    
		break; 
		  
		} 
		  } 
		
		 System.out.printf("%nGrade Report:%n");
		
		
		
	}
}
