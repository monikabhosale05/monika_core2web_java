import java.util.*;
class Number{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Temp=0, Rem=0,Sum=0;		
		System.out.print(" Please Enter any Number : ");
		int Num = sc.nextInt();		
		Temp = Num;
		while(Temp>0){ 
		    Rem= Temp %10;
		    int i=1,Fact=1;
		    while (i<=Rem){
		     	Fact= Fact * i;
		     	i++;
		    }
		    System.out.println(" The Factorial of " + Rem+ "  =  " + Fact);
		     Sum = Sum + Fact;
		     Temp = Temp /10;
		}
		System.out.println(" The Sum of the Factorials of a Given Number " + Num + " =  " + Sum);
		if ( Num == Sum ){
			System.out.println("\n " + Num + " is a Strong Number");}
		else{
		   System.out.println("\n " + Num + " is Not a Strong Number");
		}
	}
}
