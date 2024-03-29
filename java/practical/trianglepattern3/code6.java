import java.util.*;
class My{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr no. of rows:");
		int row=sc.nextInt();
		for(int i=row;i>=1;i--){
			  char ch='a';
                                int num=1;
			for(int j=1;j<=i;j++){
				if(j%2==0){
					System.out.print(ch + " ");
					ch++;
				}
				else{
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println("");
		}
	}
}
