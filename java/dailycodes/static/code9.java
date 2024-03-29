class True{
                void methodrun(){
                        System.out.println("in method run");
                }
                void methodgun(){
                        System.out.println("in method gun");
                }
                void methodfun(){
                        System.out.println("in method fun");
                }
                public static void main(String[] args){
                        System.out.println("in main method");
			True obj= new True();
                        obj.methodrun();
                        obj.methodgun();
                        obj.methodfun();
                }
        }
