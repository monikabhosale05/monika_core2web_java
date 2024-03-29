class Core{
	public static void main(String[] args){
		long num=9307922405L;
		long rem=0,sum=0;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}

