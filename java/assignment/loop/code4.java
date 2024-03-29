class Tap{
	public static void main(String[] args){
		int num=301071;
		int val=0;
		int temp=num;
		while(temp!=0){
			val=val*10 + (temp%10);
			temp/=10;
		}
		System.out.println(temp);
		System.out.println(val);
		System.out.println(num);
	}
}
