
public class Stra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=7, num=4;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=star;j++) {
				if(j==i||(j+i)/2==num||i==4||j==7||j==1||(i-j)==1) {
					System.out.print("*");
				}else
				{
				System.out.print(" ");
				
			}
			
		}
			System.out.println("");
			
		}

	}

}
