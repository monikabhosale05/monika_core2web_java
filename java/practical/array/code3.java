import java.util.*;
class Demo{
     public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter thr size");
	     int size=sc.nextInt();
	     int arr[]=new int[size];
	     for(int i=0;i<size;i++){
		     System.out.println("enter the elements:");
		     arr[i]=sc.nextInt();
	     }
	     System.out.println("array elemnts are:");
	     for(int i=0;i<size;i++){
		     System.out.print(arr[i] + " ");
	     }
	     System.out.println("");
	     for(int i=0;i<size;i++){
	     if(arr[i]%2==0){
		     System.out.print(arr[i] + " ");
	     }
	     }
     }
}


		     
