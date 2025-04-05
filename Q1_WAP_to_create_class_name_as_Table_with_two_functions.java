package oop;
import java.util.*;
/*
 * Q1. WAP to create class name as Table with two functions 
void setValue(): this function is used for accept number from keyboard 
void showTable(): this function can display the table of number 
 */
class Table{
	int num;
	
	public void setValue(int num) {
		this.num=num;
	}
	
	public void showTable() {
		System.out.println("Table Of "+num);
		for(int i=1;i<=10;i++) {
			System.out.print(i*num+" ");
		}
	}
	
}
public class Q1_WAP_to_create_class_name_as_Table_with_two_functions {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter Number For Show Table");
		int num = s.nextInt();
		
		Table table = new Table();
		
		table.setValue(num);
		table.showTable();

	}

}
