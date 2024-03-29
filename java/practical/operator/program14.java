class Bin{
	public static void main(String[] args){
		int x=14;
		int y=22;
		System.out.println(++x + y++);
		System.out.println(++x + y++);
		System.out.println(x++ + ++y + ++x + ++x);
	}
}
