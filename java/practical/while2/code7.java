class Num{
	public static void main(String[] args){
		int cnt=0,rem=0;
		int num=93079224;
		System.out.println("Count of digit");
		while(num>0){
			rem=num%10;
			cnt=cnt+1;
			num=num/10;
		}
		System.out.println(cnt);
	}
}
