class New{
        public static void main(String[] args){
                char data='B';
                System.out.println("before switch");
                switch(data){
                        case 'A':
                                System.out.println("A");
                                break;
                        case 'B':
                                System.out.println("B");
                                break;
                        case 'C':
                                System.out.println("C");
                                break;
                        default:
                                System.out.println("in default");
                }
                System.out.println("after switc");
        }
}
