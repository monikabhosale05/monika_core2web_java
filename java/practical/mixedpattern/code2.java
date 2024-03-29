import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no. of rows:");
                int row=sc.nextInt();
		int n=64+row;
		for(int i=1;i<=row;i++){
			int b=row-1+i;
		    for(int j=1;j<=row;j++){
			    System.out.print(""+(char)n + b-- + " ") ;
			    
		    }
		    System.out.println("");
		    
		}
	}
}
