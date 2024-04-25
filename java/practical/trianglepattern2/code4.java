import java.io.*;
class Monika{                                                                                                                                               public static void main(String[] args)throws IOException{
                BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
                System.out.print("enter no of rows: ");
                int row=Integer.parseInt(br.readLine());
		int num1=65;
		int num2=97;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
                              int b=num2+row-j;
			      int a=num1+row-j;
				if(i%2==0){
					System.out.print((char)a + " ");
				}
				else{
					System.out.print((char)b + " ");
				}
			}
			System.out.println("");
		}
}
}
