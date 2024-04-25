import java.util.*;
class Monika{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int size=sc.nextInt();
		char arr[]=new char[size];
		for(int i=0;i<size;i++){
			System.out.print("enter element:");
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i++){
		if(arr[i]>=(char)97 && arr[i]<=(char)120){
			arr[i]=(char)(arr[i]-32);
		}}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}



