import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int count=0,num1=0,num2=0;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter elements:");
                        arr[i]=sc.nextInt();
                }
                int arr2[]=new int[size];
		for(int j=0;j<size;j++){
			System.out.print("enter array 2 elements:");
			arr2[j]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(arr[i]==arr2[j]){
					System.out.println(arr[i]);
				}
				else{
					System.out.print("");
				}
		}
	}
}
}
				

