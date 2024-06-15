class Parent{
	int x=10;
	Parent(){
		System.out.println("in Parent");
	}
}
class Child extends Parent{
	int x=20;
	Child(int x){
		System.out.println("in child");
	        System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}
	public static void main(String[] args){
		Child obj=new Child(5);
	}
}
