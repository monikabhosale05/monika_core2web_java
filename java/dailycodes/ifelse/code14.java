class Monika{
        public static void main(String[] args){
                int num=6;
                System.out.println("before switch");
                switch(num){
                        case 1:
                                System.out.println("one");
                                break;
                        case 2:
                                System.out.println("two");
                                break;
                        case 3:
                                System.out.println("three");
                                break;
                        default:
                                System.out.println("in default state");
                }
                System.out.println("after switch");
        }
}
