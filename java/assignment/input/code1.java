import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number");
		int n=sc.nextInt();
		System.out.println(n);
		if(n%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
	}
}
