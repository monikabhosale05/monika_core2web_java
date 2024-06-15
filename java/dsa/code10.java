class My{
	public static void main(String[] args){
		int size=5;
		int arr[]=new int[]{2,3,1,0,7};
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(arr[0]<arr[i]){
			max=arr[i];
			}
		}
		System.out.println(max);
	}
}
