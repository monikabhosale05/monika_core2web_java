class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=10;
		int leftmax[]=new int[n];
		leftmax[0]=arr[0];
		for(int i=1;i<n;i++){
			if(leftmax[i-1]<arr[i])
				leftmax[i]=arr[i];
			else
				leftmax[i]=leftmax[i-1];
		}
		for(int i=0;i<n;i++){
			System.out.print(leftmax[i] + " ");
		}
	}
}
