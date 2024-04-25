import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows");
		int row=sc.nextInt();
		int ch=64+row;
		int ch2=96+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
					System.out.print((char)ch + " ");
				}
				else{
					System.out.print((char)ch2 + " ");
				}
				ch++;ch2++;
			}
			System.out.println("");
		}
	}
}
