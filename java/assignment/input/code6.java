import java.util.*;
class Monika{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("enter num1 : ");
		int num1=sc.nextInt();
		System.out.println("num1:" + num1);
		System.out.print("enter num2 : ");
		int num2=sc.nextInt();
		System.out.println("num2 :" + num2);
		for(int i=num1;i<=num2;i++){
			System.out.println(num1 + " ");
			num1++;
		}
	}
}
