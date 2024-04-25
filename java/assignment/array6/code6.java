import java.util.*;
class Monika{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter element:");
			arr[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		for(int i=0;i<size;i++){
			if(arr[i]%num==0){
				System.out.println("element multiple of "+ num + "is "+arr[i]);
			}
		}
	}
}
