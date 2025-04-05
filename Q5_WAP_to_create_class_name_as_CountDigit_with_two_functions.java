package oop;
import java.util.*;
/*
Q5. WAP to create class name as CountDigit with two functions 
 void setValue(): this function can accept number from keyboard 
 void showDigitCount(): this function can count the digit and display it.
 */

class CountDigit{
	int num;
	public void setValue(int num) {
		this.num=num;
	}
	public void showDigitCount() {
		int count=0;
		
		while(num!=0){
			num=num/10;
			count++;
		}
		System.out.println("Digit Count is : "+count);
	}
}
public class Q5_WAP_to_create_class_name_as_CountDigit_with_two_functions {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = s.nextInt();
		
		CountDigit cd = new CountDigit();
		
		cd.setValue(num);
		cd.showDigitCount();

	}

}
