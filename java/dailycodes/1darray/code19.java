import java.util.*;
class CheckDemo{
        public static void main(String[] args){
                int empId[]=new int[3]{10,23,33,44,55};
                System.out.println(empId[0]);
                System.out.println(empId[1]);
                System.out.println(empId[2]);
                System.out.println(empId[3]);
                empId[0]=10;
                empId[1]=20;
                empId[2]=30;
                empId[3]=40;
                System.out.println(empId[0]);
                System.out.println(empId[1]);
                System.out.println(empId[2]);
                System.out.println(empId[3]);
        }
}
