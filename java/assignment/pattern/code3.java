import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int space=1;
                for(int i=1;i<=row;i++){
                        for(space=1;space<=row-i;space++){
                                System.out.print("  " );
                      }
                        for(int j=1;j<=i;j++){
				int a=row;
                                System.out.print(a-j+1+ " ");
                        }
                        System.out.println("");
                }
        }
}
