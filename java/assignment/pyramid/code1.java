import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no.of rows:");
		int row=sc.nextInt();
		int sp=1;
		for(int i=1;i<=row;i++){
			for( sp=1;sp<=row-i;sp++){
				System.out.print("\t");
			}
			int n=1;
			for(int j=1;j<=i;j++){
				System.out.print(n++ + " ");
			}
			System.out.println("");
		}
	}
}
