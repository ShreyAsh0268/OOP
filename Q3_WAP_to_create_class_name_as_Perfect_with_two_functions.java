package oop;
import java.util.*;

/*Q3. WAP to create class name as Perfect with two functions 
void setValue(): this function can accept number as parameter 
void checkPerfect(): this function can check number is perfect or not if perfect the show message number is perfect if not then show message number is not perfect
 */

class Perfect{
	int num;
	
	public void setValue(int num) {
		this.num=num;
	}
	
	public void checkPerfect() {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println(num+" is perfect number");
		}
		else {
			System.out.println(num+" is Not perfect number");
		}
	}
}
public class Q3_WAP_to_create_class_name_as_Perfect_with_two_functions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = s.nextInt();
		
		Perfect per = new Perfect();
		
		per.setValue(num);
		per.checkPerfect();
	}

}
