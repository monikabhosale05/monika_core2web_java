import java.util.*;
class Core2{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enetr player info:");
                String info=sc.nextLine();
                StringTokenizer st=new StringTokenizer(info,",");
                String str1=st.nextToken();
                String str2=st.nextToken();
                String str3=st.nextToken();
                String str4=st.nextToken();
                System.out.println("player name:" +str1);
                System.out.println("jersy no:" +str2);
                System.out.println("Average:" +str3);
                System.out.println("Grade:" +str4);
        }
}

