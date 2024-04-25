import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int flag=0;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
		for(int i=0;i<size/2;i++){
			if(arr[i]==arr[size-1-i]){
				flag=1;
		}
		}
		if(flag==1){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}

