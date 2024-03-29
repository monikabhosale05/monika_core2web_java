import java.io.*;
class My{
	public static void main(String[] args)throws IOException{
		BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no> of rows");
		int row=Integer.parseInt(b.readLine());
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch++ + "  ");
			}
			System.out.println("");
		}
	}
}
