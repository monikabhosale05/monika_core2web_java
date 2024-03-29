import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter size:");
                int size=sc.nextInt();
		int sum=0;
                int arr[]=new int[size];
                System.out.println("size of array is:"+size);
                for(int i=0;i<size;i++){
                        System.out.println("enter element:");
                        arr[i]=sc.nextInt();
                }
                System.out.println("array elements are:");
                for(int i=0;i<size;i++){
                        System.out.println(arr[i]);
                }
		for(int i=0;i<size;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
        }
}
