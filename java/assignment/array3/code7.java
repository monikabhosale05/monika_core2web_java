import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.print("enter elemnts:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(size%2==1 && size>=5 && arr[i]%2==1){
				System.out.println("odd elements:"+arr[i]);
			}
		  else {
			  if(size%2==0 && arr[i]%2==0){
				System.out.println( "even elements:"+arr[i]);
			}
		
		}
	}
}
}
