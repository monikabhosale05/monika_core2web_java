import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no.of rows:");
                int row=sc.nextInt();
                int col=0,space=0;
                for(int i=1;i<row*2;i++){
                 
                        if(i<=row){
                                space=row-i;col=i*2-1;}
                        else{
                                space=i-row;col-=2;}
                        for(int sp=1;sp<=space;sp++){
                                System.out.print("\t");
                                               }
			int num=4;
                        for(int j=1;j<=col;j++){
                                if(i<row){
                                        System.out.print(num + "\t");}
                                else{
                                        System.out.print(num + "\t");
                                }
			num--;}
                        System.out.println("");
                }
        }
}
