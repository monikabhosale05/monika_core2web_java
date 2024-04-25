import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int c=0;int sum=0;
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();}
           
                for(int i=0;i<arr.length;i++){
                        int num=1;int count=0;
                        while(num<=arr[i]){
                                if(arr[i]%num==0){
                                        count++;}
                                        num++;
                                }
                                if(count<=2){
                                        System.out.print("prime number "+ arr[i]);
				        c++;
					sum=sum+arr[i];}
				else{
					System.out.print("not prime number"+ arr[i]);
				}
				System.out.println();
                        }
		System.out.println("count of prime no is "+ c);
		System.out.println("sum of prime number is " +sum);
                }
        }
