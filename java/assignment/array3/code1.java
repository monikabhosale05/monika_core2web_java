import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			arr[i]=arr[i]+15;
			System.out.println(arr[i]);
		}
	}
}
