class Parent{
	int x=10;
	Parent(){
		System.out.println("in parent");
	}
}
class Child extends Parent{
	int x=20;
	Child(){
		System.out.println("in child constructor");
		System.out.println(x);
		System.out.println(super.x);
	}
	void fun(){
		System.out.println("in fun");
	}
	public static void main(String[] a){
		Child obj=new Child();
		obj.fun();
	}
}
