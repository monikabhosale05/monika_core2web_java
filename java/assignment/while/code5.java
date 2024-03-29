class Core{
	public static void main(String[] args){
		int num=216985,rem=0;
		while(num>0){
			rem=num%10;
			if(rem%2==0){
				System.out.print(rem*rem*rem + " ");
			}
			else{
				System.out.print("");
			}
		      num=num/10;
		}
	}
}
