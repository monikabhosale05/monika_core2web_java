import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows");
                int row=sc.nextInt();
		int ch=96+row;
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(num%2==0){
					System.out.print(num + " ");}
				else{
					System.out.print((char)ch + " ");
				}
				ch++;
				num++;
			}
			System.out.println("");
		}
	}
}
