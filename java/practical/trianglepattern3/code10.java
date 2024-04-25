import java.util.*;
class Core{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int a=97+row-i;
			int b=65+row-i;
			for(int j=row;j>=i;j--){
				if(i%2==1){
					System.out.print((char)a-- +" " );
				}
				else{
					System.out.print((char)b-- + " ");
				}
			}
			System.out.println("");
		}
	}
}
