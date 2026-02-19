
import java.util.Arrays;

public class InnerClasses {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
//    static int  add(int a,int b){
//        return a+b;
//    }
//    static int add(int ...a){
//        int sum=0;
//        for (int n:a)
//            sum+=n;
//        return sum;
//    }
    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);


//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//static class A {
//
//}
