package arrayexamples;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		int size,pos,el,i=0,prev=0;//declaring variables
		System.out.println("Enter the size of Array");
		Scanner sc=new Scanner(System.in);
		//Receive size of the array
		size=sc.nextInt();
		int array[]=new int[size];
		while(i<size) {
		System.out.println("Enter position you want to insert");
		pos=sc.nextInt();
		if(pos<=size&&pos>0&&pos!=prev) {
			System.out.println("Enter element you want to insert");
			el=sc.nextInt();
			array[pos-1]=el;
			System.out.println("Inserted Successfully!!!\n");
			i++;
			prev=pos;
		}
		else
		{
			System.out.println("Your Enterd length is grater or less then Array size or you enterd previous position\n");
		}
		
		}
		
		System.out.println("Your arra elements are: ");
		for(i=0;i<array.length;i++) {
			
			System.out.println("Element in position: "+(i+1)+" is:"+" "+array[i]);
		}
		

	}

}
