import java.util.*;
class Emp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count:");
		int count=sc.nextInt();
		int age[]=new int[count];
		for(int i=0;i<count;i++){
			System.out.print("enter age of emp :");
			age[i]=sc.nextInt();
		}
		System.out.println("");
		for(int i=0;i<count;i++){
			System.out.println("age  of emp id "+i + " is " + age[i]);
		}
	}
}
