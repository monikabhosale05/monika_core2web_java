import java.io.*;
class Monika{                                                                                                                                             public static void main(String[] args)throws IOException{
                 InputStreamReader isr=new  InputStreamReader(System.in);                                                                                        BufferedReader br=new BufferedReader(isr);
                 String name=br.readLine();
                 System.out.println("name :" + name);
		 br.close();
                 String  compname=br.readLine();
                 System.out.println("company name :"+ compname);
        }
}
