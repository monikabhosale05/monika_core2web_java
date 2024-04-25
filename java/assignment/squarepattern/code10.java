import java.util.*;
class C2W{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter no. of rows:");
                int row=sc.nextInt();
      		for(int i=1;i<=row;i++){
			int num=row;
			int ch=64+row;
                        for(int j=1;j<=row;j++){
                                if(i%2==1){
                                        if(num%2==1){
                                        System.out.print(num + " ");
					}
					else{
						System.out.print((char)ch + " ");
					}
					num--;
					ch--;
				}
			
                                else{
                                        System.out.print((char)ch + " ");
					ch--;
				}
		}
		
                        System.out.println("");
                }
        }
}
