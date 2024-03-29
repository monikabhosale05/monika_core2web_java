import java.util.*;
class Verify{                                                                                                                                            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enetr no. :");
                int n=sc.nextInt();        
	        int p,count=0;
	        p=n;
	        for(int i=2;i<n;i++){
		if(n%i==0){
		count++;
		}
		}
	if(count>=1){
	System.out.print("composite no."+ n);
	}
       else{
          System.out.println(n + "is not composite no.");
       }
}
}
