import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter array size :");
                int size=sc.nextInt();
                int arr[]=new int[size];
		System.out.println("enter array elemnts:");
                for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
	        System.out.println("enter elements to search:");
		int ele=sc.nextInt();
		for(int i=0;i<size;i++){
			if(ele==arr[i])
			System.out.println(arr[i] + " found at index "+i );
		}
	}
}

                     
