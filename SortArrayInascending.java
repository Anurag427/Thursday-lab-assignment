package arrayexamples;

import java.util.Scanner;

public class SortArrayInascending {

	public static void main(String[] args) {
		  int temp = 0,size;     
		Scanner sc=new Scanner(System.in);
		//Receive size of the array
		System.out.println("Enter Size of the array: ");
		size=sc.nextInt();
		int array[]=new int[size];

		System.out.println("Enter elements in the Array: ");
		
		//loop to insert elements in the array
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
		}
	           
	           
	        //Sort the array in ascending order    
	        for (int i = 0; i < array.length; i++) {     
	            for (int j = i+1; j < array.length; j++) {     
	               if(array[i] > array[j]) {    
	                   temp = array[i];    
	                   array[i] = array[j];    
	                   array[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	            
	        //printing elements of array after sorting    
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < array.length; i++) {     
	            System.out.print(array[i] + " < ");    
	        }    
	    }    
	    
	}

