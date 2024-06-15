class Demo{
	public static void main(String[] args){
		int n=5;
		int arr[]=new int[]{1,8,7,506,90};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(max<arr[i]){
				max=arr[i];
			}}
				System.out.println("largest element is:"+ max);
		}
}
