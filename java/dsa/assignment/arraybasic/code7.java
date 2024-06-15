class Demo{
	public static void main(String[] args){
		int n=5;
		int arr[]=new int[]{9,0,1,3,0};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(max<arr[i]){
				max=arr[i];
				temp=temp*10+max;
				
