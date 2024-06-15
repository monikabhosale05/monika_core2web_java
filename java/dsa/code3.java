import java.util.*;
class Demo{
	static int sum(int num){
		int add=0;
		for(int i=1;i<=num;i++){
			add=add+i;
		}
		return add;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ret=sum(num);
		System.out.println(ret);
	}
}
