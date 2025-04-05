package oop;
import java.util.*;
/*
 
 Q24. Perform Method overloading using string operation 
void stringOperation(String s): this function can accept string as parameter and sort it
void stringOperation(String first,String second): this function can compare two strings with each other and if strings 
are equal then show message strings are equal otherwise not
void stringOperation(String s,char ch): this function can accept string as parameter and search specific character
in it if character found say character found otherwise show message character not found.

 */

class StringOperation{
	String s,first,second;
	char ch;
	public void stringOperation(String s) {
		this.s=s;
		char ch[]=s.toCharArray();
		s="";
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++) {
			s=s+ch[i];
		}
		System.out.println("String After Sorting : "+s);
		
	}
	
	public void stringOperation(String first,String second) {
		this.first=first;
		this.second=second;
		
		if(first.equals(second)) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not equals");
		}
	}
	
	void stringOperation(String s,char ch) {
		this.s=s;
		char ch1[]=s.toCharArray();
		Arrays.sort(ch1);
		boolean flag=false;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch) {
				flag=true;
				break;
				//System.out.println("Character found");
			}
		}
		if(flag) {
			System.out.println("Character found");
		}
		else {
			System.out.println("Character not found");
		}
	}
}
public class Q24_Perform_Method_overloading_using_string_operation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringOperation so = new StringOperation();
		
		System.out.println("Enter String ");
		String str = s.nextLine();
		
		System.out.println("Enter First String");
		String fs = s.nextLine();
		
		System.out.println("Enter Second String");
		String ss = s.nextLine();
		
		System.out.println("Enter Character");
		char ch = s.next().charAt(0);
		
		so.stringOperation(str);
		so.stringOperation(fs, ss);
		so.stringOperation(str, ch);
	}

}
