package chp16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Account {
	
	private String bankAccount;
	private int balance;
	
	public Account(String account, int bal) {
		bankAccount = account;
		balance = bal;
		
	}
	
	public String getBal() {
		return "" + balance;
	}
	
	public String getAcc() {
		return "" + bankAccount;
	}
	
	public void addInterest(int interest) {
		balance = balance + interest;
	}
	
	
	public static void main(String [] args) {
		Account acc1 = new Account("ABCD1", 1000);
		Account acc2 = new Account("ABCD2", 2000);
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(acc1);
		accounts.add(acc2);
		
		Iterator<Account> iAccounts = accounts.iterator();
		
		System.out.println("The Accounts: ");
		
		while(iAccounts.hasNext()) {
			Account temp = iAccounts.next();
			System.out.println("Account: " + temp.getAcc() + " Balance: " + temp.getBal());
			System.out.println("Add Interest: ");
			int interest = scan.nextInt();
			temp.addInterest(interest);
			System.out.println("New Balance: " + temp.getBal());
		}
		
		
		
	}
	
}
