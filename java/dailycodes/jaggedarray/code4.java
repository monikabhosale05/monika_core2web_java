import java.util.*;
class Mon{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size of row & col");
                int row=sc.nextInt();
                int col=sc.nextInt();
                int arr[][]=new int[row][col];
                System.out.println("enter array elements:");
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                arr[i][j]=sc.nextInt();
                        }
                }
                System.out.println("Array elements are:");
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                System.out.print(arr[i][j]+ " ");
                        }
                        System.out.println("");
                }
		System.out.println(arr[1][1]);
		System.out.println(arr[2]);
		System.out.println(arr);
        }
}                                                                  
