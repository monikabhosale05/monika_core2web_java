import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows");
                int row=sc.nextInt();
		int num=row*row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j%2==1){
					System.out.print(num*i + " ");}
				else{
					System.out.print("@" + " ");}
				num--;}
			System.out.println("");
		}
	}
}
