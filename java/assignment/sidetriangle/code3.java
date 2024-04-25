import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of rows:");
		int row=sc.nextInt();
		int col=0;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				col=i;}
			else{
				col--;}
			int num=col;
			for(int j=1;j<=col;j++){
				System.out.print(num-- + " ");
				
			}
			System.out.println("");
		}
	}
}
