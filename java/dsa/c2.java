class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=10;
		int rightmax[]=new int[n];
		rightmax[n-1]=arr[n-1];
		for(int i=1;i<9;i++){
			if(rightmax[i+1]<arr[i])
				rightmax[i]=arr[i];
			else
				rightmax[i]=rightmax[n-1];
		}
		for(int i=1;i<n;i++){
			System.out.print(rightmax[i] + " ");
		}
	}}
