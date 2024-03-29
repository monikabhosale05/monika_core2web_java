class My{
	public static void main(String[] args){
		int num=1;
		char ch='A';
		for(int i=1;i<=9;i++){
			if(i%2==1){
				System.out.print(ch +" ");
			}
			else{
				System.out.print(num + " ");
			}
			num++;
			ch++;
		}
	}
}
