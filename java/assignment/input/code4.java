import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the enter");
		int num=sc.nextInt();
		System.out.println("num :"+ num);
		for(int i=1;i<=10;i++){
			System.out.println(num*i + " ");
		}
	}
}
