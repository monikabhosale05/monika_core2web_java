import java.util.*;
class Std{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enetr the roll no of std :");
			arr[i]=sc.nextInt();
		}
		System.out.println("");
	       for(int i=0;i<size;i++){
		       System.out.println("Roll no. of student:"+ arr[i]);
	       }
	}
}
