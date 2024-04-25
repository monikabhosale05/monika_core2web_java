import java.util.*;
class Digit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.print("enter no. of rows:");
			int row=sc.nextInt();
			char ch='A';
			char ch2='a';
			for(int i=1;i<=row;i++){
				for(int sp=row;sp>i;sp--){
					System.out.print("\t");
				}
				for(int j=1;j<=i*2-1;j++){
					if(i%2==1){
						if(j<i){
							System.out.print(ch++ + " \t");
						}
						else if(j==1){
							System.out.print(ch + "\t ");
						}
						else{
							System.out.print(ch-- + "\t ");
						}
					}
					else{
						 if(j<i){
                                                        System.out.print(ch2++ + " \t");
                                                }
                                                else if(j==1){
                                                        System.out.print(ch2 + " \t");
                                                }
                                                else{
                                                        System.out.print(ch2-- + " \t");
                                                }
					}
				}
				System.out.println("");
			}
		}
	}
