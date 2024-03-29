class Dig{
        int x=10;
        static int y=20;
        void run(){
                System.out.println("in run method");
        }
        static void fun(){
                System.out.println("in fun method");
        }
        public static void main(String[] args){
                Dig obj=new Dig();
                System.out.println(x);
                System.out.println(obj.y);
                run();
                obj.fun();
        }
}
