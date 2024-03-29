import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.print(i + " ");
			}
			else{
				System.out.print("");
			}
		}
	}
}
