import java.util.*;
class Dig{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size;i++){
                        if(arr[i]%2==0){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
		}
	}
}
