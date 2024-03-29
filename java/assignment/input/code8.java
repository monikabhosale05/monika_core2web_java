import java.util.*;
class Sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num1 :");
		int num1=sc.nextInt();
		System.out.println("num1=" + num1);
		System.out.print("enetr num2 : ");
		int num2=sc.nextInt();
		System.out.println("num2="+ num2);
		int sum=0;
		for(int i=num1;i<=num2;i++){
			sum=sum+num1;
			num1++;
		}
		System.out.println(sum);
	}
}
