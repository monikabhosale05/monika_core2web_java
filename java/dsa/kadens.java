class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;int x=-1;
		int start=-1;
		int end=-1;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){	
		      if(sum==0)
			      x=i;
		      sum=sum+arr[i];
		      if(sum>maxsum){
	          	    maxsum=sum;
			    start=x;
		            end=i;
			  }
		      if(sum<0){
			      sum=0;
		      }}
		      for(int i=start;i<=end;i++){
			      System.out.print(arr[i] + " ");
		      }
		      System.out.println("");
			      
	}}
