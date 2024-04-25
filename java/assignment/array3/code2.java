import java.util.*;
class Core{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int cnt=0;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
		int ele=sc.nextInt();
                for(int i=0;i<size;i++){
		if(arr[i]==ele){
			System.out.println(arr[i] + " found at index"+ i);
			cnt++;
			break;}
		}

		if(cnt==0){
			System.out.println(ele + " is not found in array");
		}
		}
	}

