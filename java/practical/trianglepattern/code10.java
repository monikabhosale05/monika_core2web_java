import java.io.*;
class Shas{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		int sum=0;
		for(int i=1;i<=row;i++){
			int num=sum+i;
			for(int j=row;j>=i;j--){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();}
	}
}

