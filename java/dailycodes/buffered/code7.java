import java.io.*;
class Core{
        public static void main(String[] args)throws IOException{
                 InputStreamReader isr=new  InputStreamReader(System.in);
                 BufferedReader br=new BufferedReader(isr);
                 String name=br.readLine();
                 System.out.println("name :" + name);
		 String  compname=br.readLine();
		 System.out.println("company name :"+ compname);
        }
}
