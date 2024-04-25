import java.util.*;
class C2W{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter array size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("enter array elements:");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size;i++){
                        if(arr[i]>5 && arr[i]<9){
				System.out.println(arr[i]+ "is greater than 5 and less than 9");
                }
		}
            
        }
}

