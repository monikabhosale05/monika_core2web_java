import java.util.*;
class Core{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem==0){
				System.out.println("Duck no.");
			}
	}
}}
