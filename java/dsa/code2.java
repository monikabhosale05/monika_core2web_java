class My{
	static int sqrt(int num){
		int val=0;
		for(int i=1;i<=num;i++){
			if(i*i<=num){
			val=i;}
			else{
				break;
			}
		}
		return val;
	}
	public static void main(String[] args){
		int num=85;
		int ret=sqrt(num);
		System.out.println(ret);
	}
}

