class Number{
	public static void main(String[] args){
		int num=2469185,rem=0,sum=0,sq=0;
		while(num>0){
			rem=num%10;
			if(rem%2==1){
				sq=rem*rem;
				sum=sum+sq;
			}
			else{
				System.out.print("");
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
