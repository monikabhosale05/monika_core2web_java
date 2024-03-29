import java.util.*;
class Web{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                int num=row;
                int ch='A';
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                if(num%2==1){
                                        System.out.print((char)ch + " ");
                                }
                                else{
                                        System.out.print(num + " ");
                                }
                                num++;
                        }
			ch++;
                        System.out.println("");
                }
        }
}
