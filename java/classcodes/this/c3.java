class Parent{
	Parent(){
		System.out.println("in parent constructor");
	}
	void fun(){
		System.out.println("in fun method");
	}
	void run(){
		System.out.println("in run method");
	}}
class Child extends Parent{
	Child(){
		System.out.println("in child constructor");
	}
	void mun(){
		System.out.println("in mun method");
	}
	void gun(){
		System.out.println("in gun method");
	}
}
class Client{
	public static void main(String[] args){
             Parent obj=new Parent();
	     obj.fun();
	     obj.run();
	     obj.mun();

	}
}

