class Check{
        public static void main(String[] args){
                float num=1.5f;
                System.out.println("before switch");
                switch(num){
                        case 1.5 :
                                System.out.println("1.5");
                                break;
                        case 2.5 :
                                System.out.println("2.5");
                                break;
                        default:
                                System.out.println("in default state");
                }
                System.out.println("after switch");
        }
}
