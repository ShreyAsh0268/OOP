package oop;
import java.util.*;

//import javax.sql.rowset.serial.SQLOutputImpl;
/*
 *  Q10. WAP to create billing application 
Classes 
Customer : id,name and mobile mark as POJO class
Product class: id,name,price,qty,rate 
Bill class contain method 
void calBill(Customer c,Product …p): this function can accept single customer detail and multiple product details and your output should like as
 */
class Customer{
	int id;
	String name;
	int mobail;
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
	public int getMobail() {
		return mobail;
	}
	public void setMobail(int mobail) {
		this.mobail = mobail;
	}
	
}
class Product{
	int id;
	String name;
	int price;
	int qty;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
class Bill{
	
	public void calBill(Customer c,Product ...p) {
		System.out.println("Customer Id : "+c.getId());
		System.out.println("Customer Name : "+c.getName());
		System.out.println("Customer Mobail : "+c.getMobail());
		
		System.out.println("Id \t Name \t Quantity \t Rate \t Total");
		int totalbill=0;
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t\t"+p[i].getPrice()+"\t"+((p[i].getQty())*(p[i].getPrice())));
			totalbill=totalbill+((p[i].getQty())*(p[i].getPrice()));
		}
		System.out.println("__________________________________________________________________________");
		System.out.println("\t\t\t\t Total Bill : "+totalbill);
	}
}
public class Q10_WAP_to_create_billing_application {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter Customer id");
		int cid=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Name");
		String cname = s.nextLine();
		
		System.out.println("Enter Mobail");
		int mob=s.nextInt();
		
		Customer c = new Customer();
		c.setId(cid);c.setName(cname);c.setMobail(mob);
		
		System.out.println("Enter which number of product you want add");
		int limit = s.nextInt();
		Product p[] = new Product[limit];
		
		for(int i=0;i<p.length;i++) {
			p[i]=new Product();
			
			System.out.println("Enter p id ");
			int pid = s.nextInt();
			s.nextLine();
			System.out.println("Enter name");
			String pname=s.nextLine();
			
			System.out.println("Enter price ");
			int pp = s.nextInt();
			
			System.out.println("Enter p Qty ");
			int pQty = s.nextInt();
			
			p[i].setId(pid);p[i].setName(pname);p[i].setPrice(pp);p[i].setQty(pQty);
		}
		Bill b = new Bill();
		b.calBill(c, p);
	}

}
