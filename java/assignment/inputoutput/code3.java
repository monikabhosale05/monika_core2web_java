import java.util.*;
class Digit{                                                                                                                                            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enetr no. :");
                int n=sc.nextInt();
                int p,count=0;
                 p=n;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count>=1){
			System.out.println("composite number :" + p);
		}
		else{
			System.out.println("not composite number" + p);
		}
}
}


