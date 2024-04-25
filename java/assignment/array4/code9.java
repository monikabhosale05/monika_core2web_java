import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                char arr[]=new char[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.next().charAt(0);
                }
		for(int i=0;i<size;i++){
			if(arr[i]>='a' && arr[i]<='z'){
				System.out.println(arr[i]);
			}
			else{
				System.out.println("#");
			}
		}
	}
}
