import java.util.*;
class Yash{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
		int num=row;
                for(int i=1;i<=row;i++){
			int ch=64+row;
                        for(int j=1;j<=row;j++){
                                if(num%2==1){
                                        System.out.print("#" + " ");
                                }
                                else{
                                        System.out.print((char)ch + " ");
					ch--;
                                }
                                num++;
                        }
                        System.out.println("");
                }
        }
}
