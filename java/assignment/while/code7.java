class Mon{
	public static void main(String[] args){
		int num=256985,rem=0,sum=0;
		while(num>0){
			rem=num%10;
			if(rem%2==0){
				sum=sum+rem;
			}
			else{
				System.out.print("");
			}
			num=num/10;
		}
		System.out.println("sum of even digit : " + sum);
	}
}
