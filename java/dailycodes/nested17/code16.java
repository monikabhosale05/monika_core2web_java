class Check{
	public static void main(String[] args){
		int num=1;
		char ch='D';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(ch++ + " ");
				}
				else{
					System.out.print(num++ + " ");
				}
			}
			System.out.println("");
		}
	}
}
