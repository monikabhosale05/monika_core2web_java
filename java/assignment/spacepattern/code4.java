import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int space=1;
                for(int i=1;i<=row;i++){
                        for(space=1;space<=row-i;space++){
                                System.out.print(" \t" );
                        }
                        int a=67-i;
                        for(int j=1;j<=i;j++){
                                int b=a+j;
                                System.out.print((char)b + "\t");
                        }
                        System.out.println("");
                }
        }
}
