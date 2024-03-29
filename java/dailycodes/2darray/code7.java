import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("size of array is:"+size);
		for(int i=0;i<size;i++){
			System.out.print("enter element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("");
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}
