import java.util.*;
class Core{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter array size:");
                int size=sc.nextInt();
                int sum=0;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
			System.out.print("enter element is :");
                        arr[i]=sc.nextInt();
                }
		System.out.println("");
                for(int i=0;i<size;i++){
                        if(size%2==0){
				if(i%2==0){
				System.out.print("array elemnts are:");
				System.out.println(arr[i] + " ");
				}
			}
			else{
				System.out.print("array elements are:");
				System.out.println(arr[i] + " ");
			}
                }
              
        }
}

