package OOPs;

import java.util.Scanner;

class AccountDetails{
	//delearing instance variables 
	private long accountNo;
	private String AccHolderName;
	private int accBalance;
	private String accType;
	
	public AccountDetails( long accountNo ,String AccHolderName,int accBalance,String accType)//Initializing variables with help of constructor
	{
		this.accountNo=accountNo;
		this.AccHolderName=AccHolderName;
		this.accBalance=accBalance;
		this.accType=accType;
	
}

public void withdraw(int accBalance ) { //method for withdrawing amount
	// checking withdraw amount is available in account or not
	if(this.accBalance>=accBalance) {
		this.accBalance=this.accBalance-accBalance;
		System.out.println("withdraw succesful...\n current balance is"+this.accBalance);
		
	}
	else {
		System.out.println("you dont have sufficient balance");
	}
	}
public void deposit(int accBalance ) { // method for deposit
	this.accBalance=this.accBalance+accBalance;
	System.out.println("desposit succsfull\n your current balance is: "+this.accBalance);
}
public void check() { // method to check account balance
	
	System.out.println("your balance is: "+this.accBalance+" "+"your account number is: "+this.accountNo+"\n "
		+"your account type is: "+this.accType);
}
}

	
public class AccountManagment {

	public static void main(String[] args) {
		int ch,a;
		AccountDetails anu=  new AccountDetails (45678443,"Anurag prasad", 30000, "saving"); 
		System.out.println("enter following numbers to do operations\n 1.withdraw\n 2.Deposit\n.3check blance");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		switch (ch) {

		  case 1:
			  System.out.println("enter amount you want to withdraw");
			  a=sc.nextInt();
			  anu.withdraw(a);
		
		    break;
		  
		  case 2:
			  System.out.println("enter amount you want to deposit");
			  a=sc.nextInt();
			  anu.deposit(a);
		    break;
		  case 3:
			 
			  anu.check();
		    break;
		  
		  
		  default:
			  System.out.println("please make a correct choice");
		   
		  } 
	}

}
