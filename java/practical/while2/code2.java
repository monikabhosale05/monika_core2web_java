class Loop{
	public static void main(String[] args){
		int num=150;
		while(num<=198){
			if(num*num%2==1){
				System.out.print(num + " ");
			}
			else{
				System.out.print( " " );
			}
			num++;
		}
	}
}
