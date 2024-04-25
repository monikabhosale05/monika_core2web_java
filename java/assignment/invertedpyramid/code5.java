import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter row:");
                int row=sc.nextInt();
                for(int i=1;i<=row;i++){
                        for(int sp=1;sp<i;sp++){
                                System.out.print("\t");
                        }
			int num=1;
                        for(int j=(row-i)*2+1;j>=1;j--){
                                System.out.print(num++ + "\t");
                        }
                        System.out.println("");
                }
        }
}
