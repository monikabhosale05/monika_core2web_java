import java.io.*;
class Mon{
        public static void main(String[] args)throws IOException{
                BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter no> of rows");
                int row=Integer.parseInt(b.readLine());
                for(int i=1;i<=row;i++){
                        int n=row;
                        for(int j=1;j<=i;j++){
                                System.out.print(n-- + " ");
                        }
                        System.out.println();
                }
        }
}
