class Demo{
	public static void main(String[] args){
		char arr[]=new char[]{'a','b','e','g','a','g'};
		int count=0;
		int itr=0;int n=6;
		for(int i=0;i<n;i++){
			if(arr[i]=='a'){
				for(int j=i+1;j<n;j++){
					if(i<j && arr[j]=='g'){
						count++;
						itr++;
					}
				}
			}}
		System.out.println(count);
		System.out.println(itr);
	}
}
		
