import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int var=0;
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]>max){
				max=arr[i];
				var=i;
			}
		}
		System.out.println("max is found at position " + var +" is "+max);
	}
}
