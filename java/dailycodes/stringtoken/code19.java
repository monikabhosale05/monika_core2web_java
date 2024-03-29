import java.util.*;
class Loop{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr player info:");
		String info=sc.nextLine();
		StringTokenizer str=new StringTokenizer(info,",");
		while(str.hasMoreTokens()){
			System.out.println(str.nextToken());
		}
	}
}
