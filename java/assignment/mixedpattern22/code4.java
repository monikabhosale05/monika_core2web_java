import java.util.*;
class Mon{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                int num=1;
                for(int i=1;i<=row;i++){
                        for(int sp=1;sp<=row-i;sp++){
                                System.out.print("\t");}
			int ch=68-i;int ch2=100-i;
                        for(int j=1;j<=i;j++){
				if(row%2==0){
                                System.out.print((char)ch2++ + "\t");}
				else{
					System.out.print((char)ch++ + "\t");}
			}
                        System.out.println("");
                }
        }
}
