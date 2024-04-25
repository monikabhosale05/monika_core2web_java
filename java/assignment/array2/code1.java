import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size :");
		int size=sc.nextInt();
		int count=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("array elements are:");
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i]);
				count++;}
		}
		System.out.println("count:"+count);
	}
}
