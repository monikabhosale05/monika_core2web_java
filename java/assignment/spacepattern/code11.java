import java.util.*;
class Check{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                for(int i=row;i>=1;i--){
                        for(int sp=i;sp<=row-1;sp++){
                                System.out.print("\t");
                        }
                        int a=64+row;
                        for(int j=1;j<=i;j++){
                                System.out.print((char)a-- + "\t");
                        }
                        System.out.println("");
                }
        }
}
