import java.io.*;
class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number of rows");
		int row=Integer.parseInt(b.readLine());
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}
	}
}
