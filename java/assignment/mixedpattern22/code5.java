import java.util.*;
class Mon{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(num*num + "\t");}
				else{
					System.out.print(num + "\t");
				}
				num++;
			}
			System.out.println("");
		}
	}
}
