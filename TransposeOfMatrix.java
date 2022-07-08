package arrayexamples;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		 int p, q;    //Declare matrix size
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows in the  matrix:");
	        p = sc.nextInt();    //Initialize  matrix size
	        System.out.print("Enter the number of columns in the  matrix:");
	        q = sc.nextInt();   //Initialize  matrix size
	        
	            int a[][] = new int[p][q];
	            int b[][] = new int[q][p];   //Declare  matrix
	              
	            //Initialize the matrix
	            System.out.println("Enter all the elements of  matrix:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < q; j++) 
	                {
	                    a[i][j] = sc.nextInt();
	                }
	            }
	            //printing before transpose
	            System.out.println("Before transposing the matrix");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < q; j++) 
	                {
	                   System.out.print(a[i][j]+" ");
	                }
	                System.out.println();
	            }
	            //transpose
	            System.out.println("After transposing the matrix");
	            for (int i = 0; i<q; i++) 
	            {
	                for (int j = 0;j<p; j++) 
	                {
	                    b[i][j] = a[j][i];
	                    System.out.print(b[i][j]+" ");
	                }
	                System.out.println();
	            }
	}

}
