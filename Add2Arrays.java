package arrayexamples;

import java.util.Scanner;

public class Add2Arrays {

	public static void main(String[] args) {
		
		 System.out.println("Enter Size of the Array1: ");
    	 Scanner sc=new Scanner(System.in);
    	//Taking size for arrays
    	  int size1=sc.nextInt();
    	  System.out.println("Enter Size of the Array2: ");
    	  int size2=sc.nextInt();
    	  if(size1==size2) //checking both arrays size is same or not
    	  {
    	 // Creating  new arrays
		int[] array1 = new int[size1];
		int[] array2 = new int[size2];
		int[] array3 = new int[size1];

		
			System.out.println("Enter elements in the array1: ");
			
			//loop to insert elements in the array
			for(int i=0;i<size1;i++)
			{
				
				array1[i]=sc.nextInt();
			}
			System.out.println("enter elements in the array2: ");
			for(int i=0;i<size2;i++) {
				
				array2[i]=sc.nextInt();
			}
		// Loop to store the elements of first array
		
		for (int i = 0; i<array1.length; i++) {
			// Adding elements of array1 and array2 and storing in array3 
			array3[i] = array1[i]+array2[i];
			
		}
		System.out.println("After Adding both arrays result is--------");
		// Loop to print the elements of array3 after adding
					for (int i = 0; i < array3.length; i++) {
						
						
						System.out.println(array3[i]);
					}
    	  }
    	  else {
    		  System.out.println("To add two arrays please insert same size for both the arrays");
    	  }
	}

}
