package arrays;

import java.util.Scanner;

public class Boss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int [] arr=new int[scan.nextInt()];
		 System.out.println("Enter the value of array");
		 for(int i=0;i<=arr.length-1;i++) {
			 arr[i]=scan.nextInt();
		 }
		 System.out.println("Enter the to check the Excepted Date there are not in Array ");
		int data=scan.nextInt();
	int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(data==arr[i]) {
				count ++;
				break;
			}
			
		}
		if(count==1) {
			System.out.println("The excepted date is availble in a Array");
		}else
		{
			System.out.println("The excepted is not availble in a array");
		}

	}

}
