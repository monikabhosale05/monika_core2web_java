class Num{
	public static void main(String[] args){
		int num=256985,rem=0,prod=1;
		while(num>0){
			rem=num%10;
			if(rem%2==1){
				prod=prod*rem;
			}
			else{
				System.out.print("");
			}
			num=num/10;
		}
		System.out.println("product of digit :" + prod);
	}
}
