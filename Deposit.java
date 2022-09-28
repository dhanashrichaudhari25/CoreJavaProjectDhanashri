package bank;

import java.util.Scanner;

public class Deposit {
	Scanner sc=new Scanner(System.in);
	int deposit() {
		long balance = 0;
		System.out.print("Enter amount to deposit:");
		int amt = sc.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		balance = balance + amt;
		return 0;
	}

}
