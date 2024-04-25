import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int sp=row;sp>i;sp--){
				System.out.print("\t");
			}
			int ch=65+row-i;
			for(int j=1;j<=i*2-1;j++){
				if(j<i){
					System.out.print((char)ch++ + " \t");
				}
				else{
					System.out.print((char)ch-- + " \t");
				}
			}
			System.out.println("");
		}
	}
}
