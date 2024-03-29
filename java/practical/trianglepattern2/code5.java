import java.io.*;
class Check{                                                                                                                                              public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.print("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		 int num=65;
		 int num1=num+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){	
				System.out.print((char)num1++  + " ");
			}
			System.out.println("");
		}
}
}
