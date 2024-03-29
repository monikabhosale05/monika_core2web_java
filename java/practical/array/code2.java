import java.util.*;
class My{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int arr[]=new int[];
	  for(int i=0;i<size;i++){
		  System.out.println("enter array elments:");
		  arr[i]=sc.nextInt();
		  
	  }
	  System.out.println("array elements are");
	  for(int i=0;i<size;i++){
		  System.out.println(arr[i]);
	  }
}
}

