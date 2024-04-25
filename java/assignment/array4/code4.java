import java.util.*;
class Code{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
                int cnt=0;
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
		System.out.print("enter number:");
		int num=sc.nextInt();
                for(int i=0;i<size;i++){
			if(num==arr[i]){
				cnt++;
			}
                }
                if(cnt>=2){
                System.out.println(num + " occures more than 2  times in array");
		}
		else{
			System.out.println(num + " not occures more than 2 times in array");
		}

        }
}
