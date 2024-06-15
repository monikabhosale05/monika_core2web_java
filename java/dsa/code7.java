class My{
	public static void main(String[] args){
		int size=10;
		int arr[]=new int[] {2,5,1,4,8,0,8,1,3,8};
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[0]<arr[i]){
				count++;
			}}
		System.out.println(count);
	}
}
