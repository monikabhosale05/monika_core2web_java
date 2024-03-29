import java.util.*;
class User{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter player info:");
		String info=sc.nextLine();
		StringTokenizer st=new StringTokenizer(info,"@");
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
	}
}
