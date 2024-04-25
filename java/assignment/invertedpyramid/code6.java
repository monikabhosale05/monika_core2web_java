import java.util.*;
class Code{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter row:");
                int row=sc.nextInt();
		int ch=65;
                for(int i=1;i<=row;i++){
                        for(int sp=1;sp<i;sp++){
                                System.out.print("\t");
                        }
                        for(int j=1; j<=(row-i)*2+1;j++){
				System.out.print((char)ch + " \t");
			}
			ch++;
                        System.out.println("");
                }
}
}
