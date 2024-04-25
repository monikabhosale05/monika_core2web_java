import java.util.*;
class Core{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
		int min=0,max=0;
                for(int i=0;i<size;i++){
                        min=arr[0];
			if(min>=arr[i]){
				min=arr[i];
			}
                }
                for(int i=0;i<size;i++){
			max=arr[0];
			if(max<=arr[i]){
				max=arr[i];
			}
		}
		System.out.println("min:"+min);
		System.out.println("max:"+max);
		int diff=max-min;
		System.out.println("diffrence:"+ diff);
	}
}
