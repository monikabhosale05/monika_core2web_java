class Trip{
	public static void main(String[] args){
		int budget=15000;
		switch(budget){
			case 6000:
				System.out.println("planning trip for Amritsar");
				break;
			case 2000:
				System.out.println("planning trip for Mahabaleshwar");
				break;
			case 10000:
				System.out.println("planning trip for manali");
				break;
			case 15000:
				System.out.println("planning trip for Jammu Kashmir");
				break;
			default:
				System.out.println("For other budget try next time");
		}
	}
}
