import java.io.*;
class Core{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
		int row=Integer.parseInt(b.readLine());
		char ch='a';
		for(int i=1;i<=row;i++){
			ch='a';
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print("$" + " ");
				}
				else{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println("");
		}
	}
}
