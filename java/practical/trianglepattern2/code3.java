import java.io.*;
class My{
        public static void main(String[] args)throws IOException{
                BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
                System.out.print("enter no of rows: ");
                int row=Integer.parseInt(br.readLine());
		int n=65;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
				int b=n+row-j;
				System.out.print((char)b + " ");
			}
			System.out.println("");
		}
	}
}
                                
