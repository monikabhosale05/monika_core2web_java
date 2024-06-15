class Parent{
	int x=10;
	Parent(){
		System.out.println("in parent");
	}
	void fun(){
		System.out.println("in fun");
	}
	 void gun(){
                System.out.println("in gun");
        }
	 void mun(){
                System.out.println("in mun");
        }
	 void run(){
                System.out.println("in run");
        }
}
class Child extends Parent{
	static int x=20;
	Child(){
		System.out.println("in child");
		System.out.println(super.x);
	}
	 void run(){
                System.out.println("in childs run");
        }
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.run();
		obj.fun();
		obj.gun();
		System.out.println(obj.x);
	}
}
