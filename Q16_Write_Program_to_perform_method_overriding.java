package oop;
import java.util.*;
/*
 Q16. Write Program to perform method overriding you have to create class name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence 
You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it 
and override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and 
you have to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it.

 */
class ArrParent{
	 int []arr;
	public void setValue(int[] arr) {
		this.arr=arr;
	}
	public void arrangeSeq() {}
	
}
class ArrangeAscendingOrder extends ArrParent{
	public void arrangeSeq() {
		System.out.println("\nArray Asending Order ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
class ReverseArray extends ArrParent{
	public void arrangeSeq() {
		System.out.println("\nArray reverse");
		int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
public class Q16_Write_Program_to_perform_method_overriding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = s.nextInt();
		System.out.println("Enter Array");
		int arr[]=new int [size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		ArrParent arp = new ArrParent();
		arp.setValue(arr);
		arp.arrangeSeq();
		
		ArrParent ao = new ArrangeAscendingOrder();
		ao.setValue(arr);
		ao.arrangeSeq();
		
		ArrParent ra = new ReverseArray();
		ra.setValue(arr);
		ra.arrangeSeq();
		
	}
}
