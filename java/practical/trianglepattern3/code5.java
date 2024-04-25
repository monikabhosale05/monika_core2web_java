import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no.of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			char ch='A';
			char ch1='a';
			for(int j=row;j>=i;j--){
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

