import java.util.*;
class Digit{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enetr the rows :");
		int row=sc.nextInt();
		System.out.print("eneter num:");
		int num=sc.nextInt();
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(num + " ");
				num-=2;
			}
			System.out.println("");
		}
	}
}
