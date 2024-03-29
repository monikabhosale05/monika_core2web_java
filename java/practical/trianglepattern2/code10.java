import java.io.*;
class Shas{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		int num=1;
		char ch='a';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch++ + " ");
						num++;
				}
				else{
					System.out.print(num++ + " ");
					ch++;
				}
			}
			System.out.println("");
		}
	}
}
