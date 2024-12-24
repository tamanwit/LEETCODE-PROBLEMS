public class leetcode50 {
    // x^n using recusive method
    public static double power(int n, double x){
        //x^n-1
        //n --> acts as the power
        //x --> acts as the base
        if (x==0) {
            return 0;
        }
        else if (n==0) {
            return 1;
        }
        double p = (double)(power(n-1, x));
        double r = (double)(x*p);
        return r;
    }
    public static void main(String[] args) {
        double ans = power(3, 2.1);
        System.out.println(ans);
    }
}
