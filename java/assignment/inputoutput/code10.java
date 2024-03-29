import java.util.*;
class Num{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("eneter the number : ");
		int num=sc.nextInt();
		int temp,sum=0,rem=0;
		temp=num;
		while(num>0){
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum){
			System.out.println(temp+ "is apalindrome no.");
		}
		else{
			System.out.println(temp+ "is not palindrome no.");
		}
	}
}
