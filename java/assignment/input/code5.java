import java.util.*;
class Sanika{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr number");
		int num=sc.nextInt();
		System.out.println("num : " + num);
		if(num%16==0){
			System.out.println(num + " is in range of 16");
		}
		else{
			System.out.println(num + " is not in range of 16");
		}
	}
}
