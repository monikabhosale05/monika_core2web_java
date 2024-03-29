import java.util.*;
class Core{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter age");
		int age=sc.nextInt();
		System.out.println("age:"+ age);
		if(age>=18){
			System.out.println("eligible for voting");
		}
		else if(age<18 && age>0){
			System.out.println("voter is not eligible for voting");
		}
		else{
			System.out.println("invalid age");
		}
	}
}
