class Outer{
        static int x=10;
	static int y=20;
	Outer(){
	System.out.println("in outer constrructor");
	}
	class Inner{
	     static int x=30;
	     Inner(int x){
		     System.out.println("inner constructor");
		     System.out.println(this.x);
		      System.out.println(y);
		     System.out.println(x);
		      System.out.println(Outer.this.x);
	     }}
     public static void main(String[] a){
	     Outer obj1=new Outer();
	     Inner obj=obj1.new Inner(50);
     }
}
