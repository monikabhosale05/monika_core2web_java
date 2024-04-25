import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("enter size:");
                int size=sc.nextInt();
		int count=0;
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        System.out.print("enter element:");
                        arr[i]=sc.nextInt();
                }
		int ele=sc.nextInt();
                for(int i=0;i<size;i++){
                        if(arr[i]==ele){
				count++;
			}
                }
		if(count>0){
		System.out.println(ele + " occures "+ count + "times in array");
               }
	       else{
		       System.out.println(ele + " not found in array");
	       }
	}
}

