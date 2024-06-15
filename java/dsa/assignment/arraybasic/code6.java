class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{1,4,5,2,7,8,3};
		int n=7,a=2,b=6;int flag=0;
		for(int i=0;i<n;i++){
		   for(int j=a;j<=b;j++){
				if(arr[j]==arr[i]){
					flag=1;
				}}}
		if(flag==1){
			System.out.println("yes");
		}}}
