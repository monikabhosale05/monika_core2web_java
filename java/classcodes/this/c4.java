class Parent{
	int x=90;
	Parent(){
		System.out.println(x);
	}
}
class Child extends Parent{
	int x=80;
	Child(int x){
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
class Demo{
	public static void main(String[] a){
		Parent p=new Child(50);
	//	Child c=new Child(10);
	}
}
