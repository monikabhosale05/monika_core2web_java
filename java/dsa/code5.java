class Demo{
	static int diff(int n1,int n2){
	int count=0;
	for(int i=n1;i<=n2;i++){
		count++;
	}
	return count;
}
public static void main(String[] args){
	int ret=diff(1,10);
	System.out.println(ret);
}
}
 
