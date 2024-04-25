import java.util.*;
class Mon{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                int num=1;
                for(int i=row;i>=1;i--){
                        for(int sp=1;sp<=row-i;sp++){
                                System.out.print("\t");}
                        for(int j=1;j<=i;j++){
                                System.out.print(num++ + "\t");
			}
                                num-=1;
                        System.out.println("");
                }
        }
}
