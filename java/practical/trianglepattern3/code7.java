import java.util.*;
class Yash{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows:");
		int row=sc.nextInt();
		int a=63+row;
		int b=row;
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(i + " ");
				}
				else{
					System.out.print((char)a-- + " ");
				}
			}
			System.out.println("");
		}
	}
}
