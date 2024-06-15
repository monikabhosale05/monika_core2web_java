class Demo{
        static int diff(int n1,int n2){
        int count=0;
        for(int i=n1;i<=n2;i++){
                count=count+i;
        }
        return count;
}
public static void main(String[] args){
        int ret=diff(1,5);
        System.out.println(ret);
}
}
