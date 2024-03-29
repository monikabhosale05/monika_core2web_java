import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no.:");
		int num=sc.nextInt();
		int rev=0;
		int a=0;
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			 a=rem;
			 if(a%2==1){
				 System.out.print(a*a + " ");
			 }
	
		
		}
		System.out.println("");
		 System.out.println(rev);
		
		
	}
}
