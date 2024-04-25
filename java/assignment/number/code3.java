import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1,sum=0;
		while(num>i){
			if(num%i==0){
				sum=sum+i;}
			i++;}
		System.out.println("sum:"+ sum);
		if(sum<num){
			System.out.println(num +"deficient number");
		}
		else{
			System.out.println("not deficient number");
		}
	}
}
