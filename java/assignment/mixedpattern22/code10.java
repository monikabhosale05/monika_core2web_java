import java.util.*;
class Code{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                for(int i=1;i<=row;i++){
                        for(int sp=row;sp>i;sp--){
                                System.out.print("\t");
                        }
                        int num=i;
                        for(int j=1;j<=i*2-1;j++){
				if(j<i){
                                System.out.print(num-- + "\t");
                        }
			else{
				System.out.print(num++ + "\t");
			}
			}
                        System.out.println("");
                }
        }
}
