import java.util.*;
class Day{
	public static void main(String[] args){
		String str="Core 2 web";
		StringTokenizer strtoken=new StringTokenizer(str," ");
		while(strtoken.hasMoreElements())
			System.out.print(strtoken.nextToken()+",");
		System.out.println();
	}
}
