import java.util.*;
class Monika{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int size=sc.nextInt();
		char arr[]=new char[size];
		for(int i=0;i<size;i++){
			System.out.print("enter character:");
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i++){
	if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u'|| arr[i]=='A'|| arr[i]=='E'|| arr[i]=='I'|| arr[i]=='O'|| arr[i]=='U'){
				System.out.println(arr[i] + "fount at "+ i);
			}
		}
	}
}

