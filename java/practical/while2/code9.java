class C2W{
	public static void main(String[] args){
		int num=214367689,rem=0;
		int even=0,odd=0;
		while(num>0){
			rem=num%10;
			if(rem%2==0){
				even=even+1;
			}
			else{
				odd=odd+1;
			}
			num=num/10;
		}
		System.out.println("count of even digit: " +even);
		System.out.println("count of odd digit: " + odd);
	}
}
