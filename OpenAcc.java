package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpenAcc {
	Scanner sc=new Scanner(System.in);
	public void openAccount()
	{
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Enter Account Number: ");
		String accNo=sc.next();
		System.out.println("Enter Account Type: ");
		String accType=sc.next();
		System.out.println("Enter Balance: ");
		long balance=sc.nextLong();
	
	List<Bank> list=new ArrayList<Bank>();
	Bank b=new Bank(name,accNo,accType,balance);
	System.out.println("Enter Name: ");
	String name1=sc.next();
	System.out.println("Enter Account Number: ");
	String accNo1=sc.next();
	System.out.println("Enter Account Type: ");
	String accType1=sc.next();
	System.out.println("Enter Balance: ");
	long balance1=sc.nextLong();
	Bank b1=new Bank(name1,accNo1,accType1,balance1);
	Bank b2=new Bank("Dhanashri","164321","current",896423);
	list.add(b);
	list.add(b1);
	list.add(b2);
	for(Bank bk:list)
	{
	System.out.println(bk);
	}
	}
}
