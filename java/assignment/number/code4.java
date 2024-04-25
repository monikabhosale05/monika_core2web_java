import java.util.*;
class Core{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1,sum=0;
		while(num>i){
			if(num%i==0){
				sum=sum+i;}
			i++;}
		System.out.println(sum);
		if(num<sum){
			System.out.println(" not abundant number");
		}
		else{
			System.out.println("abundant number");
		}
	}
}
