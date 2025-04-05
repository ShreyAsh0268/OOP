package oop;
import java.util.*;
/*
 * Q2. WAP to create class name as Factorial with two functions 
void setNumber(): this function can accept the number as parameter
void displayFactorial(): this function can display the factorial of number  
 */
class Factorial{
	int num;
	
	public void setNumber(int num) {
		this.num=num;
	}
	
	public void displayFactorial() {
		System.out.println("Factorial of : "+num);
		
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
public class Q2_WAP_to_create_class_name_as_Factorial_with_two_functions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Nuber");
		int num = s.nextInt();
		
		Factorial facto = new Factorial();
		
		facto.setNumber(num);
		facto.displayFactorial();
	}

}
