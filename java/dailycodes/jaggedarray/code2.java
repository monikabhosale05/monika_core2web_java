import java.io.*;
class OneD{
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter array size:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("enter elements:");
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}
