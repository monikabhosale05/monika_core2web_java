import java.io.*;
class Shas{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		int n=row;
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(n + " ");
			}
			n--;
			System.out.println("");
		}
	}
}
