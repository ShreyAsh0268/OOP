package oop;
import java.util.*;
/*
 * Q14. Write a java program to create class name as ArrayOperation using contsructor overloading name as :

	ArrayOperation(int [ ])
	{
		//  Sort Array Ascending and Descending Order.
	}
	
	ArrayOperation(int a[ ] , int b[ ])
	{
		//  Merge Two Array and display it.
	}
 */
class ArrayOperation{
	int a[];
	int b[];
	int c[];
	
	public ArrayOperation(int[] a) {
		System.out.println("Array acending oredr");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nArray disending oredr");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	public ArrayOperation(int []b,int []c) {
		
		int d[]=new int [b.length+c.length];
		
		System.out.println("\nArray after mearge");
		int k=0;
		for(int i=0;i<b.length;i++) {
			
				d[k++]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			
			d[k++]=c[i];
	}
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
		}
	}
	
}
public class Q14_Write_a_java_program_to_create_class_name_as_ArrayOperation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first array size");
		int size=s.nextInt();
		System.out.println("Enter first array ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter second array size");
		int size1=s.nextInt();
		System.out.println("Enter second array ");
		int b[]=new int[size1];
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		
		
		
		ArrayOperation ao=new ArrayOperation( a);
		ArrayOperation ao1=new ArrayOperation(a,b);
			
	}

}
