import java.util.*;
class Monika{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int count=0;
                char arr[]=new char[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.next().charAt(0);
                }
		System.out.print("enter element to check:");
		char ch=sc.next().charAt(0);
		for(int i=0;i<size;i++){
			if(ch==arr[i]){
				count++;
			}
		}
		System.out.println(ch + " occures " + count + " times in array");
	}
}

