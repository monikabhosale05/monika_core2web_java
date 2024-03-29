import java.util.*;
class MyDemo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int space=1;
                for(int i=1;i<=row;i++){
                        for(space=1;space<=row-i;space++){
                                System.out.print("  " );
                        }
			int num=1;
                        for(int j=1;j<=i;j++){
                                System.out.print(num++ + " ");
                        }
                        System.out.println("");
                }
        }
}
