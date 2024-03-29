import java.util.*;
class Digit{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no. of rows:");
                int row=sc.nextInt();
		int num=2;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num + " ");
				num+=2;
			}
			System.out.println("");
		}
	}
}

