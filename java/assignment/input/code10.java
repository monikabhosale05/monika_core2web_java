import java.util.*;
class Take{
	public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
		System.out.print("enetr math marks :");
		int math=sc.nextInt();
		System.out.println("math :"+math);
		 System.out.print("enetr marathi  marks :");
                //Scanner sc=new Scanner(System.in);
		int marathi=sc.nextInt();
                System.out.println("marathi :"+ marathi);
	        System.out.print("enetr english marks :");
                //Scanner sc=new Scanner(System.in);
		int english=sc.nextInt();
                System.out.println("english: " + english);
		 System.out.print("enetr science marks :");
                //Scanner sc=new Scanner(System.in);
		int science=sc.nextInt();
                System.out.println("science : " + science);
		if(math<=100 && marathi<=100 && english<=100 && science<=100){
			System.out.println("valid marks");
		}
		else{
			System.out.println("invalid marks");
		}
		int total=math+marathi+english+science;
		System.out.println("total :" + total);
	}
}


