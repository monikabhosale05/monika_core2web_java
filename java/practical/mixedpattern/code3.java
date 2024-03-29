import java.util.*;
class Core{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int num1=1;
			int num=64+row;
			for(int j=1;j<=row;j++){
				if(i%2==0){
					System.out.print(num1++ + " ");
				}
				else{
					System.out.print((char)num-- + " ");
				}
			}
			System.out.println("");
				
		}
	}
}
