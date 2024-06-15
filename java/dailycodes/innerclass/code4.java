class Demo{
	class Inner1{
		static int x=10;
		static void run(){
			System.out.println("in run");
		}}
	public static void main(String[] a){
		Demo d=new Demo();
		Inner1 obj1=d.new Inner1();
	}
}
