import java.util.*;
class C2W{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int sp=row;sp>i;sp--){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				if(i%2==1){
					System.out.print(i + "\t ");
				}
				else{
					System.out.print(ch + " \t");
				}
			
			}
			ch++;
			System.out.println("");
		}
	}
}
