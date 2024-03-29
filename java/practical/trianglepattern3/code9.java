import java.util.*;
class Mon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.print("eneter no. of rows:");
			int row=sc.nextInt();
			int num=sc.nextInt();
			for(int i=row;i>=1;i--){
				for(int j=1;j<=i;j++){
					System.out.print(num + " ");
					num-=2;
				}
				System.out.println("");
			}
		}
	}
