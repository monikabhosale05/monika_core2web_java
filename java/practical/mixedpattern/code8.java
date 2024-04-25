import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no. of rows:");
                int row=sc.nextInt();
		System.out.print("enter character:");
		char ch=sc.next().charAt(0);
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print(ch-- + " ");
			}
			System.out.println("");
		}
	}
}

