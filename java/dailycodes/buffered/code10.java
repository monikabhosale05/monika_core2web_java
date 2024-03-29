import java.io.*;
class Num{                                                                                                                                             public static void main(String[] args)throws IOException{
             BufferedReader br=new  BufferedReader(new  InputStreamReader(System.in));
	     System.out.print("enter company name:");
                 String cmpName=br.readLine();
	     System.out.print("enter employee name:");
                 String  name=br.readLine();
		  System.out.println(" company name :" + cmpName);
                 System.out.println("employee name :"+ name);
        }
}
