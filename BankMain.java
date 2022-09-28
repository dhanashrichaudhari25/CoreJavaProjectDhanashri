package bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		long balance=0;
		System.out.println("***********BANKING APPLICATION**********");
		System.out.println("========================================");
		 System.out.println(" 1. Open Account\n 2. Deposit the amount\n 3. Withdraw the amount \n 4. Exit ");  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice: ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Account Details: ");
			new OpenAcc().openAccount();
			break;
			
		case 2:
			System.out.println("Deposit: ");
			new Deposit().deposit();
			System.out.println("Your Money has been successfully depsited");  
			break;
			
		case 3:
			System.out.println("Withdraw: ");
			new Withdraw().withdrawal();
			break;
			
		default:
			System.out.println("\n Exit");
			break;

		}
		}

}
