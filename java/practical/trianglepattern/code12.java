import java.io.*;
class Shas{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		for(int i=1;i<=row;i++){
			int ch=64+i;
			for(int j=row;j>=i;j--){
				int sum=i+j;
				if(sum%2==0){
					System.out.print((char)ch+" ");
				}
				else{
					System.out.print(ch+" ");
				}
				ch++;
			}
			System.out.println("");
		}
	}
}
						
