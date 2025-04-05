package oop;
import java.util.*;
/*
 Q19. Customer Abstract Class
Problem: Create an abstract class Customer with the following methods:
·        addTransaction(double amount) — adds a transaction amount.
·    	getBalance() — returns the current balance.
Then, create two subclasses:
·        PremiumCustomer — offers a 10% discount on all transactions.
·        RegularCustomer — no discount on transactions.
Write a program that adds transactions for both types of customers and shows their final balance after applying the discount.
Explanation:
·    	The abstract class Customer provides methods for adding transactions and checking balances.
·    	Each subclass implements the transaction logic differently by applying a discount.
·    	Logical operation: Method overriding to apply discounts and track customer balances.

 */
abstract class Customer1{
	double amount;
	public void addTransaction(double amount) {
		this.amount=amount;
	}
	public void getBalance() {}
}

class PremiumCustomer extends Customer1{
	public void addTransaction(double amount) {
		this.amount=amount;
	}
	public void getBalance() {
		double cb = amount-(amount*0.10);
		System.out.println("Current balance is : "+cb);
	}
}

class RegularCustomer extends Customer1{
	public void addTransaction(double amount) {
		this.amount=amount;
	}
	public void getBalance() {
		System.out.println("Current balance is : "+amount);
	}
}
public class Q19_Customer_Abstract_Class {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select Customer type \n 1. Premium Customer \n 2. Regular Customer");
		
		int ch = s.nextInt();
		do {
			switch(ch) {
			case 1:
				Customer1 p = new PremiumCustomer();
				System.out.println("Enter Ammount");
				double amount = s.nextDouble();
				p.addTransaction(amount);
				p.getBalance();
				break;
			case 2:
				Customer1 r = new RegularCustomer();
				System.out.println("Enter Ammount");
				 amount = s.nextDouble();
				r.addTransaction(amount);
				r.getBalance();
				break;
			}
		}while(true);
		
	}

}
