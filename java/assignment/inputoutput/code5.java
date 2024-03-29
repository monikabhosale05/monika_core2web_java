import java.util.*;
class Letter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr no.");
                int num=sc.nextInt();
		int fact=1;
		while(num>=1){
			fact=fact*num;
			num--;
		}
		System.out.println("factorial of 5 is: " + fact);
	}
}

