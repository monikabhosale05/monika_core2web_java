class Demo{
	int x=10;int y=20;
	Demo(int x,int y){
		System.out.println("construc");
		System.out.println(x);
		System.out.println(y);
		this.x=x;
	        this.y=y;
	}
	void fun(){
		 System.out.println(this.x);
		  System.out.println(this.y);
	}
	public static void main(String[] a){
		Demo d=new Demo(2,3);
		d.fun();
	}
}
 
