import java.util.*;
class Digit{
       public static void main(String[] args){
	       Scanner sc=new Scanner(System.in);
	       System.out.print("enetr num1");
	       int num1=sc.nextInt();
	       System.out.println("num1 : " + num1);
	        System.out.print("enetr num2");
               int num2=sc.nextInt();
               System.out.println("num2 : " + num2);
	       for(int i=num1;i<=num2;i++){
	       if(num1%2==0){
		       System.out.print(num1 + " ");
	       }
	       else{
		       System.out.print("");
	       }
               num1++;
	       }
       }
}
