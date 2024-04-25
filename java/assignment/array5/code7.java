import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        System.out.print("enter elements:");
                        arr[i]=sc.nextInt();}
                System.out.println("composite numbers are:");
                for(int i=0;i<arr.length;i++){
                        int num=1;int count=0;
                        while(num<=arr[i]){
                                if(arr[i]%num==0){
                                        count++;}
                                        num++;
                                }
                                if(count>2)
                                        System.out.print(arr[i]+ " ");
                                }
                                System.out.println();
                }
        }


