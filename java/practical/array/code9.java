import java.util.*;
class Man{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter elements:");
			arr[i]=sc.nextInt();
		}
		System.out.println("");
		for(int i=0;i<size;i++){
			if(i%2==1){
				System.out.println(arr[i]+ "is an odd indexed elemen");
			}
		}
	}
}

