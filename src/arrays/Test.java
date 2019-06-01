package arrays;

public class Test {
	public static void main(String[] args) {
		int a[]= new int [100];
	for(int i=5;i<=a.length-1;i++) {
			a[i]=i;
		}
		
	for (int i : a) {
		System.out.println(i);
	}
	}

}
