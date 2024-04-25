import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int i=0;
                char arr[]=new char[size];
                for( i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.next().charAt(0);
                }
		for(i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j] + "at index "+i);
					break;}
		}
	}
}}
