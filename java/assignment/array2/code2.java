import java.util.*;
class MyDemo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter array size :");
                int size=sc.nextInt();
                int sum=0;
                int arr[]=new int[size];
		System.out.println("enter elements:");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("array elements are:");
                for(int i=0;i<size;i++){
                        if(arr[i]%3==0){
                                System.out.println(arr[i]);
                                sum=sum+arr[i];
                }
        }
	System.out.print("sum:"+sum);
}
}
