class Mon{
	public static void main(String[] args){
		int num=216985,rem=0;
		System.out.println("odd digit");
		while(num>0){
			rem=num%10;
			if(rem%2==1){
				System.out.print(rem + " ");
			}
			else{
				System.out.print( " ");
			}
			num=num/10;
		}
	}
}
