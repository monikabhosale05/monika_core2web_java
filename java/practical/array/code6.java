import java.io.*;
class Core{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char arr[]=new char[10];
		System.out.println("enter array elemnts:");
		for(int i=0;i<10;i++){
			arr[i]=(char)br.read();
		}
		System.out.println("array elements are:");
		for(int i=0;i<10;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
