class Outer{
	int x=90;
	static int y=80;
	static int a=10;
	Outer(){
		System.out.println("in outer constructor");
	}
	class Inner{
		Inner(){
			int z=70;
			System.out.println("in inner constructor");
		        System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
	void fun(){
	        int b=30;
		System.out.println("in fun method");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] s){
		Outer out=new Outer();
		Inner obj=out.new Inner();
		out.fun();
	}
}
