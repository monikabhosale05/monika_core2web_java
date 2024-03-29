import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(i%2==1){
				sum=sum+arr[i];
			}
		}
		System.out.println("sum of odd indexed elements:"+ sum);
	}
}
				

