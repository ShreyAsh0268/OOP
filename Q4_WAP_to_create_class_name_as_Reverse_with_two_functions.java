package oop;
import java.util.*;
/*
Q4. WAP to create class name as Reverse with two functions 
void setNumber(): this function can accept the number from keyboard 
void reverseNumber(): this function can reverse the number and display it
 */

class Reverse{
	int num;
	public void setNumber(int num) {
		this.num=num;
	}
	public void reverseNumber() {
		
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("After Reverse Number is :"+rev);	
	}
}
public class Q4_WAP_to_create_class_name_as_Reverse_with_two_functions {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Number");
	int num = s.nextInt();
	
	Reverse rev = new Reverse();
	rev.setNumber(num);
	rev.reverseNumber();
	}
}
