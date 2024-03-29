import java.io.*;
class Yash{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		int n=row;
		char ch='a';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(n+j + " ");
				}
				else{
						System.out.print(ch++ + " ");
				}
			}
		System.out.println("");
		}
	}
}

