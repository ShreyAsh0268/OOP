package oop;
import java.util.*;
/*
 * Q12. Write a java program to create class name ReverseApp using constructor name as :

	ReverseApp(int [ ])
	{
		//  perform integer reverse array logic.
	}
	
	ReverseApp(String )
	{
		//  perform string reverse logic.
	}

 */
class ReverseApp{
	int a[];
	String str;
	
	public ReverseApp(int[] a) {
		int b[]=new int [a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--) {
			b[k]=a[i];
			k++;
		}
		System.out.println("Array After reverse");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
	
	public ReverseApp(String str) {
		char[] ch=str.toCharArray();
		str="";
		System.out.println("\nString After Reverse");
		for(int i=0;i<ch.length;i++) {
			str=ch[i]+str;
		}
		System.out.println(str);
	}
}
public class Q12_Write_a_java_program_to_create_class_name_ReverseApp_using_constructor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = s.nextInt();
		System.out.println("Enter array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		s.nextLine();
		System.out.println("Enter String");
		String str = s.nextLine();
		
		ReverseApp rva = new ReverseApp(a);
		ReverseApp rvs = new ReverseApp(str);
	}

}
