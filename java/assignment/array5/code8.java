import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int count=0;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter elements:");
                        arr[i]=sc.nextInt();
                }
                int max=0,max2=0;
		for(int i=0;i<size;i++){
			max=arr[0];
			if(arr[i]>max){
			max=arr[i];
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i]>=max2 && arr[i]<max){
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}
}
		
