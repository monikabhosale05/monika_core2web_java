import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no. of rows:");
                int row=sc.nextInt();
		int n=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(n*j + " ");
			}
			System.out.println("");
			n--;
		}
	}
}
