class Demo{
	public static void main(String[] a){
		int n=11,count=0;
		int arr[]=new int[]{9,12,23,10,12,12,15,23,14,12,15};
		for(int i=0;i<n;i++){
			int j=1;
			while(j<n){
			if(arr[i]==arr[j]){
				count++;
				j++;
			}}
		if (count%2==0){
			System.out.println(arr[i]);
		}}
	}
}

