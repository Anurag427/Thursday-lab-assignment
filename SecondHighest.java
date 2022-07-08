package arrayexamples;
import java.util.Scanner;

public class SecondHighest {

	
	public static void main(String[] args) {
				System.out.println("Enter the size of 1st Array");
				int size,max=0,prev=0,j;
				Scanner sc=new Scanner(System.in);
				//Receive size of the array
				size=sc.nextInt();
				int array[]=new int[size];

				System.out.println("Enter elements in the Array: ");
				
				//loop to insert elements in the array
				for(int i=0;i<size;i++) {
					
					array[i]=sc.nextInt();
				}
				
				for(j=0;j<size;j++) {
					
						if(array[j]>max) //checking maximum number
						{
							prev=max;
							max=array[j];
							
							
						}
					
					}
		
			System.out.println("second highest maximum element in the array is: "+prev);
		


			}

		

	}


