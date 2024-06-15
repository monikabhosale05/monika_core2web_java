class Demo{
	public static void main(String[] args){
		int n=1999009,rem=0,temp=0,num=0;
		while(n>0){
			rem=n%10;
			if(rem==0){
				rem=5;}
			temp=temp*10+rem;
			n=n/10;}
		while(temp>0){
			rem=temp%10;
			num=num*10+rem;
			temp=temp/10;
		}
		System.out.println(num);

}}


