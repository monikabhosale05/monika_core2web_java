import java.util.*;
class Yash{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		int num=row+1-i;
		int ch=97+row-i;
			for(int j=row;j>=i;j--){
				if(j%2==0){
					System.out.print(num + " ");
					num--;
					ch--;
				}
				else{
					System.out.print((char)ch + " ");
					num--;
					ch--;
				}
			}
			System.out.println("");
		}
	}
}
