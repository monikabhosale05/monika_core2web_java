class Mon{
	public static void main(String[] args){
		int num=9;
		char ch='A';
		for(int i=1;i<=9;i++){
			if(i%2==1){
				System.out.print(num + " ");
			}
			else{
				System.out.print(ch + " ");
				}
			num--;
			ch++;
		}
	}
}
