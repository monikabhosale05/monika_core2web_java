class Check{
	public static void main(String[] args){
		int num=256985;
		int rem=0;
		while(num>0){
			rem=num%10;
			if(rem%2==1){
				System.out.print(rem*rem + " ");
			}
			else{
				System.out.print("");
			}
			num=num/10;
		}
	}
}
