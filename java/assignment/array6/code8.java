import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
		int size=sc.nextInt();
                char arr[]=new char[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i+=2){
			System.out.print(arr[i] + " ");}
		System.out.println("");
	        
		for(int i=0;i<size/2;i++){
			char temp=arr[i];
			arr[i]=arr[size-i-1];
		        arr[size-i-1]=temp;
		}
	          for(int i=0;i<size;i+=2){
                        System.out.print(arr[i] + " ");}
	}
}



