import java.io.*;
class Shas{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		char ch='D';
		for(int i=row;i>=1;i--){
			ch='D';
			for(int j=1;j<=i;j++){
				System.out.print(ch-- + " ");
			}
			System.out.println("");
		}
	}
}
