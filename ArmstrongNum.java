package corejava;

import java.util.Scanner;

public class ArmstrongNum { 
	public static void arm(int number) { //creating method to check armstrong number
	
	 int temp, result = 0,ldigit; // Declaring variables

     temp = number;

     while (temp != 0)// Initializing loop
     {
    	 ldigit=temp %10; //calculating last digit
        
         
         result= result+(ldigit*ldigit*ldigit); // calculating cube of the last digit 
         temp=temp/10; // removing last digit 
     }
     if (result == number)// Checking Armstrong or not
     {
         System.out.println("Armstrong Number");
     }
     else
     {
         System.out.println("Not Armstrong Number");
     
     }
	}
     public static void main(String[] args) {
 		int x; // declearing variables
 		Scanner sc=new Scanner(System.in);// creating scanner class object
 		System.out.println(" enter number to cheack its armstrong or not"); 
 		x=sc.nextInt();// taking input from the user 
 		arm(x);// calling method arm
} 
}
