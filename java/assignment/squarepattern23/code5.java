import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows");
                int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print(num + " ");
					num++;}
					else{
						System.out.print("$" + " ");}
				}
				else{
					System.out.print(num + " ");}
			}
		      System.out.println("");
		}
	}
}
