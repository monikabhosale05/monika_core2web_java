import java.util.*;
class Code{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
                int rev=0;
		int a=0;
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size/2;i++){
			int temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
                         
}
