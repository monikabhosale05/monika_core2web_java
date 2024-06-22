class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{12,2,3,34};
		int a=2;
		for(int i=0;i<arr.length;i++){
			if(i==a){
				continue;}
				System.out.print(arr[i] + " ");
		}
	}}
