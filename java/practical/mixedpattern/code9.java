import java.util.*;
class Lake{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no. of rows:");
                int row=sc.nextInt();
		int num=65;
		for(int i=row;i>=1;i--){
			int num1=1;
			for(int j=1;j<=i;j++){
				int b=num+row-j;
				if(i%2==1){
					System.out.print((char)b-- + " ");
				}
				else{
					System.out.print(num1++ + " ");
				}
			}
			System.out.println("");
		
}
	}
}
