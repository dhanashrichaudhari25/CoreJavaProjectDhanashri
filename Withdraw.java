package bank;

import java.util.Scanner;

public class Withdraw {
	 public void withdrawal() {  
	        long amt;  
	        long balance = 0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  

}
