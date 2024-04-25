import java.util.*;
class Code{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows:");
		int row=sc.nextInt();
	        int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
					System.out.print(num*num + " ");
				}
				else{
					System.out.print(num + " ");
				}
				num++;
			}
			System.out.println("");
		}
	}
}
