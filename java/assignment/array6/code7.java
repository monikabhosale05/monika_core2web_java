import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]>=67 && arr[i]<=90){
				System.out.print((char)arr[i] + " ");
			}
			else{
				System.out.print(arr[i]+ " ") ;
			}
		}
	}
}
