import java.io.*;
class Monika{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter your name:");
                String name=br.readLine();
                System.out.println("enter Society name:");
                 String Scname=br.readLine();
                System.out.println("enter wing:");
                 char wing=br.readLine();
                System.out.println("enter flat no.:");
                 int flatno=Integer.parseInt(br.readLine());
        }
}

