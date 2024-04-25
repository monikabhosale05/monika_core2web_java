import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows");
                int row=sc.nextInt();
		int num=row;char ch='d';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print(num*num-1 + " ");}
					else{
						System.out.print(ch + " ");}
				}
				else{
					System.out.print(ch + " ");
				}
				num++;ch++;
			}
			System.out.println("");
		}
	}
}
