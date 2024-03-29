class Check{
	public static void main(String[] args){
		int num1=2;
		int num2=4;
		if(num1>0 && num2>0){
			 if(num1%2==0 && num2%2==0){
				 System.out.println(num1*num2);
			 }
			 else{
				 System.out.println("number is odd");
			 }
		}
		else{
			System.out.println("number is negative");
		}
	}
}

