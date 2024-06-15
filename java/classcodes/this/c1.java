class Demo{
      int x=80;
      Demo(int x){
	      System.out.println(x);
	      System.out.println(this.x);
	      this.x=x;
      }
      void fun(int x){
	      System.out.println(x);
	      this.x=x;
	       System.out.println(this.x);
      }
      public static void main(String[] args){
	      Demo d=new Demo(90);
	      d.fun(70);
      }
}
