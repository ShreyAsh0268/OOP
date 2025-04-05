package oop;
import java.util.*;
/*
 Q23. WAP to perform following operation on string 
Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098
Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number. 

Your Task is:  you have to create class name as RemoveLeaningZero with two methods 

void setString(String s): this method accept string as parameter 
String getStringWithoutZero(): this method can remove zero and return string after removing leading zero.

 */
class RemoveLeadingZero{
	String str;
	public void setString(String str) {
		this.str=str;
	}
	public String getStringWithoutZero() {
		char ch[]=str.toCharArray();
		str="";
		int count=0;
		for(int i=0;i<ch.length;i++) {
			count++;
			if(ch[i]!='0') {
				break;
			}
		}
		
		for(int i=count-1;i<ch.length;i++) {
			str=str+ch[i];
		}
		return str;
	}
}

public class Q23_WAP_to_perform_following_operation_on_string {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = s.nextLine();
		
		RemoveLeadingZero rlz = new RemoveLeadingZero();
		rlz.setString(str);
		String result = rlz.getStringWithoutZero();
		System.out.println("After Removing leading Zeros : "+result);
	}

}
