class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int prefixsum[]=new int[arr.length];
		prefixsum[0]=arr[0];
		int maxsum=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++){
			prefixsum[i]=prefixsum[i-1]+arr[i];
		}
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=i;j<arr.length;j++){
				if(i==0)
					sum=prefixsum[j];
				else
					sum=prefixsum[j]-arr[i-1];
			}
			if(sum>maxsum)
				maxsum=sum;
		}
		System.out.println(maxsum);
	}
}

