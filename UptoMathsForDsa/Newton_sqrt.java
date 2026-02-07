public class Newton_sqrt {
    public static void main(String[] args) {
        System.out.println(newtonsqrt(40));
    }
    static double newtonsqrt(double n){
        double root;
        double x=n;
        while(true){
            root=(x+n/x)*0.5;
            if(Math.abs(root-x)<0.01) break;//0.01 is error b/w asume and actual sqrt
            x=root;
        }
        return root;
    }
}
