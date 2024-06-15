class Outer{
	Outer(){
		System.out.println("constructor outer");
	}
	class Inner1{
		Inner1(){
			System.out.println("constructor inner1");
		}
		class Inner2{
			Inner2(){
				System.out.println("constructor inner2");
			}
		}}
	public static void main(String[] args){
		Outer outobj=new Outer();
		Outer.Inner1 obj1=outobj.new Inner1();
		Inner1.Inner2 obj2=obj1.new Inner2();
	}
}
