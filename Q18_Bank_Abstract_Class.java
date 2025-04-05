package oop;
import java.util.*;
/*
 Q18. Bank Abstract Class
Problem: Create an abstract class Bank with the following methods:
deposit(double amount) — allows depositing an amount.
withdraw(double amount) — allows withdrawing an amount.
getBalance() — returns the current balance.
Then, create two subclasses:
SavingsBank — charges a fixed fee of $2 per transaction.
CurrentBank — charges a fixed fee of $5 per transaction.
Write a program that deposits and withdraws money from both types of banks and displays the balance after each transaction.
Explanation:
The abstract class Bank defines the common structure for the deposit, withdraw, and balance methods.
Each subclass applies a different transaction fee.
Logical operation: Use method overriding to show different transaction fees for each type of bank.

 */
abstract class Bank{
	double dAmount;
	double wAmount;
	public void deposit(double dAmount) {
		this.dAmount=dAmount;
	}
	
	public void withdraw(double wAmount) {
		this.wAmount=wAmount;
	}
	
	abstract public void getBalance();
}


class SavingsBank extends Bank{
	Scanner s = new Scanner(System.in);
	public void deposit(double dAmount) {
		this.dAmount=dAmount;
	}
	
	public void withdraw(double wAmount) {
		this.wAmount=wAmount;
	}
	
	public void getBalance() {
		double aBalance=1000; // 1000 is default balnce
		
		System.out.println("Select performed transection \n 1. Deposit \n 2. Withdraw");
		int ch = s.nextInt();
		switch(ch) {
		case 1:
			aBalance=(aBalance+dAmount)-2;
			System.out.println("Balance In Account is : "+aBalance);
			break;
		case 2:
			if(aBalance<(wAmount+2)) {
				aBalance=aBalance-(wAmount+2);
				System.out.println("Balance In Account is : "+aBalance);
			}
			else {
				System.out.println("Account Balance is Not Suficaint");
			}
			break;
		}
	}
}

class CurrentBank extends Bank{
	Scanner s = new Scanner(System.in);
	public void deposit(double dAmount) {
		this.dAmount=dAmount;
	}
	
	public void withdraw(double wAmount) {
		this.wAmount=wAmount;
	}
	
	public void getBalance() {
		double aBalance=1000; // 1000 is default balnce
		
		System.out.println("Select Performed transection \n 1. Deposit \n 2. Withdraw");
		int ch = s.nextInt();
		switch(ch) {
		case 1:
			aBalance=(aBalance+dAmount)-5;
			System.out.println("Balance In Account is : "+aBalance);
			break;
		case 2:
			if(aBalance>(wAmount+5)) {
				aBalance=aBalance-(wAmount+5);
				System.out.println("Balance In Account is : "+aBalance);
			}
			else {
				System.out.println("Account Balance is Not Suficaint");
			}
			break;
		}
	}
}
public class Q18_Bank_Abstract_Class {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select Account Type \n 1. Saving Account \n 2. Current Acount");
		int ach=s.nextInt();
		
		switch(ach) {
		case 1:
			Bank saving = new SavingsBank();
			System.out.println("Select Transection Type \n 1. Deposit \n 2. Withdraw");
			int tch=s.nextInt();
			switch(tch) {
			case 1:
				System.out.println("Enter Deposite Ammount");
				double dAmount=s.nextDouble();
				
				saving.deposit(dAmount);
				saving.getBalance();
				break;
			case 2:
				System.out.println("Enter Withdraw Ammount");
				double wAmount=s.nextDouble();
				saving.withdraw(wAmount);;
				saving.getBalance();
				break;
			}
			break;
		case 2:
			Bank curent = new CurrentBank();
			System.out.println("Select Transection Type \n 1. Deposit \n 2. Withdraw");
			 tch=s.nextInt();
			switch(tch) {
			case 1:
				System.out.println("Enter Deposite Ammount");
				double dAmount=s.nextDouble();
				
				curent.deposit(dAmount);
				curent.getBalance();
				break;
			case 2:
				System.out.println("Enter Withdraw Ammount");
				double wAmount=s.nextDouble();
				curent.withdraw(wAmount);
				curent.getBalance();
				break;
			}
			break;
		}
	}

}
