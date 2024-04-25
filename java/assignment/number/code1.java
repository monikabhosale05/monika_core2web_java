import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		int sum=0,i=1;
		while(i<num){
			if(num%i==0){
				sum=sum+i;}
			i++;
		}
			if(sum==num){
				System.out.println( " perfect no.");
			}
			else{
				System.out.println( "not perfect no");
			}
		}}


