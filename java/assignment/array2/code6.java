import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter array size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
		int product=1;
                System.out.println("enter array elements:");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
               }
                for(int i=0;i<size;i++){
			if(i%2==1){
                        product=product*arr[i];

                        }
                }
		System.out.println("product of odd indexed elemnt is:" + product);
        }
}

