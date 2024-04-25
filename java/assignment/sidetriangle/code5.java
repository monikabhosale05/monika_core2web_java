import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no of rows:");
                int row=sc.nextInt();
                int col=0;
                int num=row;
                for(int i=1;i<row*2;i++){
                        if(i<=row){
                                col=i;}
                        else{
                                col--;}
                        int a=row-col+65;
                        for(int j=1;j<=col;j++){
                                if(i<=row){
                                System.out.print((char)a + "  ");}
                                else{
                                        System.out.print((char)a + "  ");
                                }}

                        System.out.println("");
                }
        }
}
