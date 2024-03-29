import java.util.*;
class Core{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	        System.out.print("enter no. of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int sp=1;sp<=row-i;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				int a=row;
                                System.out.print(a*j + "\t");
			}
			System.out.println("");
		}
	}
}
