import java.util.*;
class My{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int rem=0;
		for(int i=0;i<size;i++){
			int count=0;
			while(arr[i]>0){
				rem=arr[i]%10;
				arr[i]=arr[i]/10;
	                        if(rem>0){
					count++;
				}}
			System.out.println(arr[i]+"count:"+count);
		}
	}}

