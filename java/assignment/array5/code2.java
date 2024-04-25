import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int esum=0;
		int osum=0;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				esum=esum+arr[i];
			}
			else{
				osum=osum+arr[i];
			}
		}
		System.out.println("even numbers sum:"+ esum);
		System.out.println("odd numbers sum:" + osum);
	}
}
