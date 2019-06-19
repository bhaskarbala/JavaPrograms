package arrays;

import java.util.Scanner;

public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner s=new 
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int [] arr=new int[scan.nextInt()];
		 System.out.println("Enter the value of array");
		 for(int i=0;i<=arr.length-1;i++) {
			 
			 arr[i]=scan.nextInt();
		 }
		 for(int i:arr) {
			 System.out.println(i);
		 }

	}

}
