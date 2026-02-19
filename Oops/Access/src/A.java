public class A {
    protected int num;
    static String name;
    int[] arr;

    public int getNum() {
        return num;
    }
//
    public  void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public static void main(String[] args) {
        A obj=new A(2,"sd");
        System.out.println(obj.getNum());
        int n = obj.num;
        System.out.println(n);
    }
}