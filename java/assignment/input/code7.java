import java.util.*;
class Loop{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		System.out.println("num : "+ num);
		for(int i=10;i>=1;i--){
			System.out.print(num*i + " ");
		}
	}
}
