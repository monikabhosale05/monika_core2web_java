import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size");
		int size=sc.nextInt();
	       int sum=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enetr elments:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		for(int i=0;i<size;i++){
			if(arr[i]%2==1){
				System.out.print(arr[i]);
			sum=sum+arr[i];
			}
		}
		System.out.println("")
			;
		System.out.print(sum + " ");
	}
}

