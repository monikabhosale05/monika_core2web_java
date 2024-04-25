import java.util.*;
class Lake{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no. of rows:");
                int row=sc.nextInt();
		int ch=64+row;
		for(int i=row;i>=1;i--){
			int num=1;
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(num++ + " ");
				}
				else{
					System.out.print((char)ch-- + " ");
				}
			}
			System.out.println("");
		
}
	}
}
