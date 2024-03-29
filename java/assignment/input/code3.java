import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in) ;
		System.out.print ("enter the number") ;
		int num = sc.nextInt();
		System.out.println("num :"+ num);
		if(num%8==0){
			System.out.println("number is divided by 8");
		}
		else{
			System.out.println("number is not divided by 8");
		}
	}
}

