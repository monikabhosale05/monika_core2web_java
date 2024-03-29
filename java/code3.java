import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter No.of rows:");
		int row=Integer.parseInt(br.readLine());
		int b=64;
		for(int i=1;i<=row;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				b+=1;
				if(i%2==0){
					System.out.print((char)b +" ");
				}
				else{
					System.out.print(num++ + " ");
				}
			}
		System.out.println("");
		}
	}
}
