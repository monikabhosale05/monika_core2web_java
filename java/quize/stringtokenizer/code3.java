import java.util.*;
class C2W{
	public static void main(String[] args){
		String str="true false";
		StringTokenizer strtoken=new StringTokenizer(str," ");
		while(strtoken.hasMoreTokens()){
			boolean b= Boolean.parseBoolean(strtoken.nextToken());
			System.out.println(b);
		}
	}
}
