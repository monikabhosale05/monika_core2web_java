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
		System.out.print("enter num");
                int num=sc.nextInt();
		int count=0;
                for(int i=0;i<size;i++){
			if(arr[i]==num){
				count++;}
		}
		if(count>2){
		for(int i=0;i<size;i++){
			if(num==arr[i]){
				arr[i]=arr[i]*arr[i]*arr[i];
			}
		}}
		 for(int i=0;i<size;i++){
                        System.out.print(arr[i] + " ");}
	}
}

	               
