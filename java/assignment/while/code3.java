class Digit{
	public static void main(String[] args){
		int num=436780521,rem=0;
		while(num!=0){
			rem=num%10;
			if(rem%2==0 || rem%3==0){
				System.out.print(rem + " ");
			}
			else{
				System.out.print("");
			}
			num=num/10;
		}
	}
}
