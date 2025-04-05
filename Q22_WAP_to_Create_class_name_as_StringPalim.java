package oop;
import java.util.*;

class StringPalim{
	String str;
	String rstr="";
	public StringPalim(String str) {
		this.str=str;
	}
	
	public String getReverse() {
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			rstr=ch[i]+rstr;
		}
		return rstr;
	}
	
	public boolean isPalim() {
		if(str.equals(rstr)) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Q22_WAP_to_Create_class_name_as_StringPalim {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.nextLine();
		
		StringPalim sp = new StringPalim(str);
		
		System.out.println("String After reverse :"+sp.getReverse());
		
		System.out.println("String is Palimdrome : "+sp.isPalim());

	}

}
