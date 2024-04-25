import java.util.*;
class New{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                for(int i=row;i>=1;i--){
                        for(int space=i;space<=row-1;space++){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=i;j++){
                                System.out.print("*"+ "\t");
                        }
                        System.out.println("");
                }
        }
}
