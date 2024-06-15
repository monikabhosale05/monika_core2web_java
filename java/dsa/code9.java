class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int size=10;
		int leftmax[]=new int[size];
		for(int i=0;i<size;i++){
			int max=Integer.MIN_VALUE;
			for(int j=0;j<=i;j++){
				if(max<arr[j])
					max=arr[j];
				}
					leftmax[i]=max;
				}
		for(int i=0;i<size;i++){
		System.out.print(leftmax[i] + " ");
	}}
}
