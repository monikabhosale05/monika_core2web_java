import java.util.*;
class My{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
                int col=0;
		
                for(int i=1;i<row*2;i++){
			int num=0;
                        if(i<=row){
                                col=row-i;}
                        else{
                                col=i-row;}
                        for(int sp=1;sp<=col;sp++){
                                System.out.print("\t");
				num++;
                        }
                        if(i<=row){
                                col=i;}
                        else{
                                col=row*2-i;}
			
                        for(int j=1;j<=col;j++){
			     System.out.print(num + "\t");	
			     num++;
                        }
                        System.out.println("");

                }
        }
}
