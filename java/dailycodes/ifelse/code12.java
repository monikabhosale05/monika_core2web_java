class Tree{
        public static void main(String[] args){
                int num=2;
                System.out.println("before switch");
                switch(num){
                        case 1:
                                System.out.println("one");
                        case 2:
                                System.out.println("two");
                        case 3:
                                System.out.println("three");
                        default:
                                System.out.println("in default state");
                }
                System.out.println("after switch");
        }
}
