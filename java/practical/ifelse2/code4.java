class Marks{
       public static void main(String[] args){
        float percentage= 78f;
        if(percentage>=85){
		System.out.println("choose medical field");
	}
	else if(percentage<=85 && percentage>=75){
		System.out.println(" choose enginnering field");
	}
	else if(percentage<=75 && percentage>=65){
		System.out.println(" choose pharmacy or bsc");
	}
	else{
		System.out.println("arts");
	}
       }
}
	   	   
