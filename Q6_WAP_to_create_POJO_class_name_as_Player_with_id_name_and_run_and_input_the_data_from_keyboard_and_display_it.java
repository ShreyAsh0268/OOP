package oop;
import java.util.*;
/*
 *Q6. WAP to create POJO class name as Player with id, name and run and input the data from keyboard and display it.
 */
class Player{
	int id;
	String name;
	int run;
	
	public Player() {
	
	}
	
	public Player(int id,String name,int run) {
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	public void displayPlayerInfo() {
		
		System.out.println(getId()+" \t"+getName()+" \t"+getRun());
	}
}
public class Q6_WAP_to_create_POJO_class_name_as_Player_with_id_name_and_run_and_input_the_data_from_keyboard_and_display_it {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which number of employe you want to add");
		int size = s.nextInt();
		
		ArrayList player = new ArrayList();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter Id");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("Enter Name");
			String name = s.nextLine();
			System.out.println("Enter Run");
			int run = s.nextInt();
			
			player.add(new Player(id,name,run));
		}
		System.out.println("ID \t"+"Name \t"+"Run");
		for(int i=0;i<player.size();i++) {
			((Player) player.get(i)).displayPlayerInfo();
		}
	}

}
