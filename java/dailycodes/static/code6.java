class C2W{
	void fun(){
		System.out.println("in fun method");
	}
	static void run(){
		System.out.println("in run method");
	}
	public static void main(String[] args){
		System.out.println("in main method");
		run();
		fun();
	}
}
