import java.util.*;
class Core{
	public static void main(String[] args){
		String str="core 2 web";
		StringTokenizer strtoken=new StringTokenizer(str," ");
		while(strtoken.hasMoreTokens())
			System.out.print(strtoken.nextToken() + ",");
		System.out.println();
	}
}
