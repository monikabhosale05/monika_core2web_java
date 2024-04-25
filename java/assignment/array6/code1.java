import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		int flag=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++){
				if(arr[i]>arr[i+1]){
				flag=1;
			}
			else{
				flag=0;
			}
		}
		if(flag==1){
			System.out.println("descending order");
		}
		else{
			System.out.println("array is not in descending order");
		}
	}
}
