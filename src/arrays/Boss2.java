package arrays;

import java.util.Scanner;

public class Boss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int [] arr=new int[scan.nextInt()];
		 System.out.println("Enter the value of array");
		 for(int i=0;i<=arr.length-1;i++) {
			 arr[i]=scan.nextInt();
		 }
		 System.out.println("Eeter the Occerance of Element");
		 int date=scan.nextInt();
		 int count =0;
		 for(int i=0;i<=arr.length-1;i++) {
			 if(date==arr[i]) {
				 count ++;
			 }
		 }
		 System.out.println("The element is occerance on Array is="+count);
		

	}

}
