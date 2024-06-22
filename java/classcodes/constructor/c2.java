class My{
	int x=10;
	int y=20;
	My(int a,int b){
		System.out.println("in constructor");
		x=a;
		y=b;
	}
	void fun(){
		System.out.println(x);
	         System.out.println(y);
	}
	public static void main(String[] a){
		My m=new My(3,4);
		m.fun();
	}
}

