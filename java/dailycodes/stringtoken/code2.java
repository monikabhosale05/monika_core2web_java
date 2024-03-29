import java.io.*;
class InputDemo{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter your name:");
                String name=br.readLine();
		br.close();
                System.out.println("enter Society name:");
                 String Scname=br.readLine();
                System.out.println("enter wing:");
                 String wing=br.readLine();
                System.out.println("enter flat no.:");
                 String flatno=br.readLine();
        }
}

