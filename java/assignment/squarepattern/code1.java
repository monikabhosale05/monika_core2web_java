import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int num=row;
			int a=64+row;
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print((char) a-- + " ");
				}
				else{
					System.out.print(num + " ");
				}
			}
			System.out.println("");
		}
	}
}
