package OOPs;
import java.util.Scanner;
public class CheckDigit {


		
		public static void main(String args[])
	    {  
			int n;
			System.out.println("Enter input to check 1st and last digit");
			Scanner sc=new Scanner(System.in);  //creating object for scanner class
			n=sc.nextInt(); //taking input to check last and first digit
			
			//declearing variables
	        int number =n;
	        int firstDigit = 0;
	        int lastDigit = 0;
	 
	        lastDigit = number%10;
	        System.out.println(" LastDigit: "+ lastDigit); //printing last digit
	 
	        while(number!=0) {
	        	firstDigit  = number%10;
	            number /= 10;
	        }
	        System.out.println(" FirstDigit: "+ firstDigit); //printing last digit
	    }
	}

