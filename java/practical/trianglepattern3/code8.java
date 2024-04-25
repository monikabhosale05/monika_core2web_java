import java.util.*;
class Check{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int num=row+1-i;
			int ch=65+row-i;
			for(int j=row;j>=i;j--){
				if(i%2==1){
					System.out.print(num-- + " ");
				}
				else{
					System.out.print((char)ch-- + " ");
				}}
			System.out.println("");
		}
		System.out.println("");
	}}
			


