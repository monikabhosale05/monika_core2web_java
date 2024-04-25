import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter elements:");
                        arr[i]=sc.nextInt();
                }
		for(int i=0;i<size;i++){
			int fact=1;
			while(arr[i]>0){
				fact=fact*arr[i];
				arr[i]--;
			}
			System.out.println(fact);
		}}}
