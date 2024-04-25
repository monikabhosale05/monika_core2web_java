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
		int rem=0,rev=0,c=0,temp=0;
                for(int i=0;i<size/2;i++){
			int count=0;
			while(arr[i]>0){
                          temp=arr[i];
			  if(temp==(temp-i-1)){
				   flag=1;
			  }
			  temp++;
                }
                if(flag==1){
                        System.out.println("palindrom at index "+ i);
                }
                else{
                        System.out.println("not palindrome at index " +i);
                }
		}
        }
}
