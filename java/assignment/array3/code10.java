import java.util.*;
class Mon{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int product=1;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter elemnts:");
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size;i++){
                        int num=1,count=0;
                        while(num<=arr[i]){
                                if(arr[i]%num==0){
                                        count++;}
                                num++;}
                        if(count<=2){
                                System.out.print(arr[i] + ":  prime ");
				product=product*arr[i];}
                        else{
                                System.out.print(arr[i] + "not prime");}
                        System.out.println();
                }
		System.out.println("product of prime no. "+ product);
        }}
