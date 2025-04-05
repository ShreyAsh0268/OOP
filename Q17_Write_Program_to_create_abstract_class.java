package oop;
import java.util.*;
 /*
 Q17. Write Program to create abstract class name as Value with one abstract and one non abstract method
void setValue(int ,int): this is non abstract method with two parameter 
abstract int getResult(): this is abstract method and 
you have two child class name as Power and you have to override getResult() method in Power class and calculate power of two values and return it 
as well as SearchDigit and you have to override getResult() consider first parameter of setValue() is number and second parameter is digit and 
you have to search digit in number and return it and if digit not found return -1.

 */
abstract class Value{
	int a;
	int b;
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	abstract int getResult();
}

class Power extends Value{

	@Override
	int getResult() {
		int pow=1;
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        return pow;
	}
	
}

class SearchDigit extends Value{

	@Override
	int getResult() {
		int num = a;
        while (num != 0) {
            if (num % 10 == b) {
                return b;
            }
            num = num/10;
        }
        return -1;
	}
	
}
public class Q17_Write_Program_to_create_abstract_class {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Parameter");
		int a = s.nextInt();
		
		System.out.println("Enter Second Parameter");
		int b = s.nextInt();
		
		Value obj = new Power();
        obj.setValue(a, b);
        System.out.println("Power Result: " + obj.getResult());
        
        Value obj1 = new SearchDigit();
        obj1.setValue(a, b);
        System.out.println("Search Digit Result: " + obj1.getResult());
	}

}
