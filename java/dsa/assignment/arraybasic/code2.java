class Demo{
	public static void main(String[] args){
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int n=6;
		int arr[]=new int[]{5,2,1,56,10000,1670000};
		for(int i=0;i<n;i++){
			if(max<arr[i]){
				max=arr[i];}
			else if(min>arr[i]){
				min=arr[i];}
		}
		System.out.println(min + " "+ max);
	}
}
