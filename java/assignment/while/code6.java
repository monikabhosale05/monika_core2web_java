class C2W{
	public static void main(String[] args){
		int num=234,rem=0,prod=1;
		while(num>0){
			rem=num%10;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println(prod);
	}
}
