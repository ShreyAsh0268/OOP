package oop;
import java.util.*;
/*
 * Q11. WAP Voting application using method with variable argos concept
Voter: id name and age mark as POJO class 
VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then display its data otherwise not
VotingMachineApp: this method cantais voter details and pass to VotingMachine class 

 */
class Voter{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class VotingMachine{
	public void acceptVoter(Voter ...v) {
		System.out.println("Id \tName \tAge");
		for(int i=0;i<v.length;i++) {
			if(v[i].getAge()>18) {
				System.out.println(v[i].getId()+"\t"+v[i].getName()+"\t"+v[i].getAge());
			}
		}
	}
}
public class Q11_WAP_Voting_application_using_method_with_variable_argos_concept {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter Voters adding limit");
		int limit = s.nextInt();
		
		Voter v[] = new Voter[limit];
		
		for(int i=0;i<v.length;i++) {
			v[i]=new Voter();
			
			System.out.println("Enter id");
			int id = s.nextInt();
			s.nextLine();
			
			System.out.println("Enter name");
			String name=s.nextLine();
			
			System.out.println("Enter age");
			int age=s.nextInt();
			
			v[i].setId(id);v[i].setName(name);v[i].setAge(age);
		}
		
		VotingMachine vm = new VotingMachine();
		vm.acceptVoter(v);
	}

}
