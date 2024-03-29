import java.io.*;
class Check{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}
}
