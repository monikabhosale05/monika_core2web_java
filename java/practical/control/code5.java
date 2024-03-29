class Value{
	public static void main(String[] args){
		int i=0;
		for( ; ;i++){
			switch(i){
				case 0:
					System.out.print("new");
				default:
					System.out.println();
			}
			if(i==10){
				break;
			}
		}
	}
}
