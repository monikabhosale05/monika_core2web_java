import java.util.*;  
   class Number{  
      public static void main(String args[]){  
      Scanner sc= new Scanner(System.in);  
          System.out.print("Enter a number to check: ");  
             int num = sc.nextInt();  
             int square = num*num;  
             int temp = num; 
	     int a=0,b=0;
             if(temp>0){
	        a=temp%10;
	        b=square%10;
	     }
            if(a==b){
             System.out.println(num+ " is automorphic number.");  }
            else { 
             System.out.println(num+ " not  an automorphic number.");  }
      }
   }
