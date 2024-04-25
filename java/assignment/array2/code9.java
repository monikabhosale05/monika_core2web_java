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
		int min=arr[0];
		System.out.print("smaller elements is:");
		for(int i=0;i<size;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
