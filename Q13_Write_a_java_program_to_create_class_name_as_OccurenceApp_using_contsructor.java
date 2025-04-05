package oop;
import java.util.*;
/*
 * Q13. Write a java program to create class name as OccurenceApp using contsructor name as :

	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	}

 */
class OccurenceApp{
	int a[];
	char ch[];
	
	public OccurenceApp(int[] a) {
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			
			if(a[i] == -1) continue;
			
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						count++;
						a[j]=-1;
					}
			}
			System.out.println("Ocurence of "+a[i]+" is : "+count);	
		}
	}
	public OccurenceApp(char[] ch) {
		int vc=0,cc=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				vc++;
			}
			else {
				cc++;
			}
		}
		System.out.println("Count of vowel is : "+vc);
		System.out.println("Count of consonent is : "+cc);
	}
}
public class Q13_Write_a_java_program_to_create_class_name_as_OccurenceApp_using_contsructor {

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
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		
		OccurenceApp oa=new OccurenceApp(a);
		
		OccurenceApp ov=new OccurenceApp(ch);
	}

}
