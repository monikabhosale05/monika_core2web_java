import java.util.*;
class Monika{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter the element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
					if(arr[i]<10){
						System.out.println( arr[i] + ": is less than 10");
					}
		}
	}
}


