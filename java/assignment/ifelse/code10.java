class Number{
	public static void main(String[] args){
		int x=0;
		System.out.println(x=x+1);
		if(x>=1){
			System.out.println(x=x+2);
		}
		else if(x>2){
			System.out.println(x=x+=3);
		}
		else if(x>3){
			System.out.println(x+=4);
		}
		System.out.println(x);
	}
}
