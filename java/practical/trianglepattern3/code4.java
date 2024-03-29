import java.util.*;
class Check{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no. of rows");
		int row=sc.nextInt();
		System.out.print("eneter character:");
		char ch=sc.next().charAt(0);
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(ch-- + " ");
			}
			System.out.println("");
		}
	}
}
