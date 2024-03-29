import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number : ");
		int num=sc.nextInt();
		int rem=0,sum=0,temp;
		temp=num;
		while(num>0){
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum){
			System.out.println( "is a palindrome number");
		}
		else{
			System.out.println("is not palindromee number");
		}
	}
}
