class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3,4,5,6};
		int size=6;
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int max2=arr[0];
		for(int i=00;i<size;i++){
			if(max2<arr[i] && arr[i]<max){
				max2=arr[i];
			}}
		System.out.println(max2);
	}
}

