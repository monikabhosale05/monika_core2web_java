import java.util.*;
class My{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int num=sc.nextInt();
		int count=0,i=2;
		while(i<=num/2){
			if(num%i==0){
				count++;
				break;
			}
			i++;
		}
		if(count==0){
			System.out.println(num + "is prime number");
		}
		else{
			System.out.println(num + "is not prime number");
		}
	}
}
