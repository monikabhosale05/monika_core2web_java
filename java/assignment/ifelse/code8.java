class On{
	public static void main(String[] args){
		int x=65;
		char ch='B';
		if(x==ch && x+1>ch){
			System.out.println(" " + ch + ch);
		}
		else if(++x>=ch){
			System.out.println(" " + x +ch);
		}
		else if(x++==ch){
			System.out.println(x+2);
		}
		else{
			System.out.println(x++);
		}
	}
}
