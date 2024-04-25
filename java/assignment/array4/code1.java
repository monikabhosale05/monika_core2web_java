import java.util.*;
class Code{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++){
			System.out.print("enter element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			sum=sum+arr[i];
		}
		int average=sum/size;
		System.out.println("average:"+ average);
	}
}
