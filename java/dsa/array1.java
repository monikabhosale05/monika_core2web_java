class Demo{
	public static void main(String[] args){
		int arr[][]=new int[][]{{1,2,3},{5,6,7},{9,10,11}};
		int total=0;
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
				total=total+sum;
			}}
			System.out.println(total);
	}
}
