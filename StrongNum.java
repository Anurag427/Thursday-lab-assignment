package corejava;

import java.util.Scanner;

public class StrongNum {            
	public static int facto(int d ,int fact) {     //creating method to calculate factorial
		int y;
for(y=1;y<=d; y++) { 
			
			
			fact=fact*y; //calculating factorial and assigning to fact
		}
return fact;   //returning fact
		
	}
	public static void strong(int n) {    // creating method to check entered number is strong or not
		
	int y,factn=1,sum=0,d; //declaring variables
	int temp=n; // creating variables and assigning number into it
	while(n>0) { // to check strong number
		//taking last digit of number
		d=n%10;
		factn=1;
		factn=facto(d,factn);   // calling method to calculate factorial
		sum=sum+factn;
		n=n/10;
	}
	if(temp==sum)  //checking its strong or not
		System.out.println(temp+" is a strong number");
	else
		System.out.println(temp+" is not");
	}

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in); // creating object for scanner class
		System.out.println(" enter number to cheack its strong or not");
		x=sc.nextInt(); //taking input from user
		StrongNum.strong(x); //calling method strong

	}

}
