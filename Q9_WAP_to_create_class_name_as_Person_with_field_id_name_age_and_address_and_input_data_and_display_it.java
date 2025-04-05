package oop;
import java.util.*;
class Person{
	int id;
	String name;
	int age;
	String address;
	
	public Person(int id,String name,int age,String address) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void display() {
		System.out.println(id+"\t"+name+"\t"+age+"\t"+address);
	}
}
public class Q9_WAP_to_create_class_name_as_Person_with_field_id_name_age_and_address_and_input_data_and_display_it {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter limit of you want add persons");
		int limit = s.nextInt();
		
		ArrayList <Person> person = new ArrayList<>();
		
		for(int i=0;i<limit;i++) {
			System.out.println("Enter id");
			int id=s.nextInt();
			s.nextLine();
			
			System.out.println("Enter name");
			String name = s.nextLine();
			
			System.out.println("Enter age");
			int age = s.nextInt();
			s.nextLine();
			
			System.out.println("Enter address");
			String add= s.nextLine();
			
			person.add(new Person(id,name,age,add));	
		}
		
		System.out.println("Id \t Name \t Age \t Address");
		for(int i=0;i<person.size();i++) {
			person.get(i).display();
		}
	}
}
