class Choice{
	public static void main(String[] args){
		int num=9367924,rem=0,prod=1,sum=0;
		while(num>0){
			rem=num%10;
			if(rem%2==1){
				sum=sum+rem;
			}
			else{
				prod=prod*rem;
			}
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(prod);
	}
}
