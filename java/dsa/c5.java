import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{-7,1,5,2,-4,3,0};
		int n=7;
		System.out.println("enter number:");
		int index=sc.nextInt();
		int sum=0,add=0,temp=0;
		for(int i=0;i<index;i++){
			sum=sum+arr[i];
		}
		for(int j=index+1;j<n;j++){
			add=add+arr[j];
		}
		temp=sum;
		System.out.println("sum"+ sum);
		System.out.println("add"+ add);
		if(temp==add){
			System.out.println(temp);
		}
		else{
			System.out.println(-1);
		}
	}
}



			

