import java.util.*;
class My{
	public static void main(String[] args){
		String str="2.3 5.6 23.5";
		StringTokenizer strtoken=new StringTokenizer(str,".");
		System.out.println(strtoken.countTokens());
	}
}
