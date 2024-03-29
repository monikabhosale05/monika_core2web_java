import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=row;i>=1;i--){
			char ch='A';
			char ch1='a';
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch1++ + " ");
				}
				else{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println("");
		}
	}
}

