class Odd{
	public static void main(String[] args){
		int sum=0;
		for(int i=150;i>=101;i--){
			if(i%2==0){
				continue;
			}
			sum=sum+i;
		}
	System.out.println(sum);
	}
}
