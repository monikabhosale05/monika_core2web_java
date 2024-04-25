import java.util.*;
class Core{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int rem=0,sum=0,n,temp=0;
	System.out.println("Enter a number");
        n=sc.nextInt();
	temp=n;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	if(sum==temp){
	System.out.println(temp+" is a armstrong number ");}
	else{
	System.out.println(temp+" is not a armstrong number ");}
}}
