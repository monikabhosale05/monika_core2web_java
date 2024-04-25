import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter elements:");
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[size];
		for(int j=0;j<size;j++){
			System.out.print("enter elements:");
			arr2[j]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
				System.out.print(arr1[i] + " ");
		}
		for(int j=0;j<size;j++){
			System.out.print(arr2[j] + " ");
		}
	}
}

