package arrayexamples;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		//creating arrays
		int array[]=new int[5];
		int array2[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements To Reverse: ");
		//loop to insert array elements
		for(int i=0;i<5;i++) {
			
			array[i]=sc.nextInt();
		}
		System.out.println("Reversed elements are: ");
//loop to print array in reverse order
for(int i=array2.length-1;i>=0;i--) {
	
	System.out.println(array[i]);
}
	}
}
