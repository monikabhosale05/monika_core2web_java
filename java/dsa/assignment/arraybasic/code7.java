class Demo{
	public static void main(String[] args){
		int n=5;
		int arr[]=new int[]{9,0,1,3,0};
		int arr1[]=new int[n];
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		      if(max<arr[i]){
			      max=arr[i];
		      }
		      if(max2<arr[i] && arr[i]<max){
			      max2=arr[i];
			   }
		      if(max3<arr[i] && arr[i]<max2){
			      max3=arr[i];
		      }}
		for(int i=0;i<n;i++){
			arr1[i]=max

		
	}
}
				
