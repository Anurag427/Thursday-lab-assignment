package arrayexamples;

import java.util.Scanner;

public class SameArrayCheck {

	public static void main(String[] args) {
		int size1, size2,count=0;
		System.out.println("Enter the size of 1st Array");
		Scanner sc=new Scanner(System.in);
		//Receive size of the array
		size1=sc.nextInt();
		int array[]=new int[size1];

		System.out.println("Enter elements in the Array: ");
		
		//loop to insert elements in the array
		for(int i=0;i<size1;i++) {
			
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd Array");
		size2=sc.nextInt();
		int array2[]=new int[size2];
System.out.println("Enter elements in the Array: ");
		
		//loop to insert elements in the array
		for(int i=0;i<size2;i++) {
			
			array2[i]=sc.nextInt();
		}
		
		if(size1==size2) {
			
			for(int i=0;i<size1;i++) {
				
				if(array[i]==array2[i]) {
					
					count++;
				}
			}
			
			if(count==size1) {
				System.out.println("Both arrays has same elements");
			}
			else {
				System.out.println("Both arrays are not same");
			}
		}
		else {
			System.out.println("Both arrays are not equal");
		}
		
	}
	

}
