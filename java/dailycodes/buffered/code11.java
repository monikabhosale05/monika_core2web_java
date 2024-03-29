import java.io.*;
class Monika{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter company name:");
		String cmpname=br.readLine();
		System.out.print("enter employee name:");
		String name=br.readLine();
		System.out.print("enter empl id:");
		int empid=br.readLine();
		System.out.println("company name:"+ cmpname);
		System.out.println("employee name:"+ name);
	}
}
