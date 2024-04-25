import java.util.*;
class C2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		int rem=0,sum=0;
		 while(num > 0){
              rem = num%10;
              sum = sum + (rem*rem);
              num = num/10;  
		 }
		 System.out.println(sum);
		 if(sum==1){
			 System.out.println("Happy number");
		 }
		 else{
			 System.out.println("not happy number");
		 }
	}
}
		
