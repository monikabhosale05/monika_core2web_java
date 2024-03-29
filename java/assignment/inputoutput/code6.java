import java.util.*;
class Digit{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enetr no. :");
                int num=sc.nextInt();
		int fact=1;
		while(num>=1){
			fact= num*fact;
			num--;
		}
		System.out.println(fact);
	}
}
