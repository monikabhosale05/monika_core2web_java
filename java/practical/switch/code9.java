class Grade{
	public static void main(String[] args){
		int marks=91;
		if(marks>=90 && marks<=100){
			System.out.println("first class with distinction");
		}
		else if(marks>=80 && marks<=90){
			System.out.println("first class");
		}
		else if(marks>=70 && marks<=60){
			System.out.println("second class");
		}
		else if(marks>=50 && marks<=60){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}
}
