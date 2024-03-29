import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no. of rows:");
                int row=sc.nextInt();
		int num=97;
	        for(int i=1;i<=row;i++){
			int b=row;
			for(int j=1;j<=i;j++){
				int a=num+row-j;
				if(i%2==0){
					System.out.print(b-- + " ");
				}
				else{
					System.out.print((char)a + " ");
				}
			}
			System.out.println("");
		}
	}
}

