public class xorFrom0To_n {
    static public  void main(String[] args) {
        int n=10;
        if (n%4==0) System.out.println(n);
        if(n%4==1) System.out.println(1);
        if(n%4==2) System.out.println(n+1);
        if(n%4==3) System.out.println(0);

    }
}
