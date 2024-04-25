import java.util.*;
class One{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}
