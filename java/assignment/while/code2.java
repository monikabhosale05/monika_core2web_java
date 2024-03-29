class Loop{
	public static void main(String[] args){
		int num=2569185,rem=0;
		while(num>0){
			rem=num%10;
			if(rem%3==0){
				System.out.print("");
			}
			else{
				System.out.print(rem + " ");
			}
			num=num/10;
		}
	}
}
