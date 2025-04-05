package oop;
import java.util.*;
/*
 Q15.  Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
	Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
			
Note- for a week only 40 hours of working are allowed. 
1. Create class Employee with data member ID, Name, total working, salary, overtime
Set Information by using a constructor and create a display Information() method to
display all information with salary.
2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
void calculateOvertime() to calculate overtime. 


 */
class Employee{
	int id;
	String name;
	int wh;
	int salary;
	int ot;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int wh, int salary, int ot) {
		super();
		this.id = id;
		this.name = name;
		this.wh = wh;
		this.salary = salary;
		this.ot = ot;
	}
	
	public void displayInformation(Employee emp[]) {
		System.out.println("Id \t Name \t total working \t salary \t overtime");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].id+"\t"+emp[i].name+"\t\t"+emp[i].wh+"\t"+emp[i].salary+"\t\t"+emp[i].ot);
		}
	}
}
class OverTime{
	Employee emp[];
	public void setEmployee(Employee emp[]) {
		this.emp=emp;
	}
	public void calculateOvertime() {
		System.out.println("Id \t Name \t total working \t salary \t overtime \t overTime Payment ");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].id+"\t"+emp[i].name+"\t\t"+emp[i].wh+"\t"+emp[i].salary+"\t\t"+emp[i].ot+"\t\t"+emp[i].ot*50);
		}
	}
}
public class Q15_Write_a_java_Program_to_calculate_overtime_pay_of_5_employees {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Employee emp[]=new Employee[2];
		
		System.out.println("Enter Employee Data");
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter id");
			int id=s.nextInt();
			s.nextLine();
			
			System.out.println("Enter name");
			String name=s.nextLine();
			
			System.out.println("Enter working hourse");
			int wh=s.nextInt();
			
			System.out.println("Enter salary");
			int sal=s.nextInt();
			
			System.out.println("Enter Over Time");
			int ot=s.nextInt();
			
			if((wh+ot) <=40) {
				emp[i]=new Employee(id, name, wh, sal, ot);
			}
			else {
				System.out.println("Employee working hourse is more than 40 its not valid");
			}
		}
		Employee emp1=new Employee();
		emp1.displayInformation(emp);
		
		OverTime oT=new OverTime();
		oT.setEmployee(emp);
		oT.calculateOvertime();
	}

}
