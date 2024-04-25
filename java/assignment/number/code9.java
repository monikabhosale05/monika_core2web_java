import java.util.*;
class Monika{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		int rem=0,sum=0,a=num;
		 while(a!=0){
            rem = a%10;
	    sum=sum+rem;
            a = a/10;
		 }
		 if(num%sum==0){
			 System.out.println("harshad number");}
		 else{
			 System.out.println("not harshad number");
		 }
	}
}
