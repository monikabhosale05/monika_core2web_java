import java.io.*;
class Shas{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.print("enter no of rows");
                int row=Integer.parseInt(b.readLine());
		char ch='a';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(j + " ");
					ch++;
				}
				else{
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println("");
		}
	}
}	
