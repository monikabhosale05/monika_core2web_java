class Bh{
	public static void main(String[] args){
		int num=1;
		char ch='A';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=3;j++){
				if(i%2==0){
					System.out.print(ch++ + " ");
					num++;
				}
				else{
					System.out.print(num++ + " ");
					ch++;
				}
				
			}
			System.out.println("");
			
		}
	}
}
