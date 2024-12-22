public class recursion3 {
    //print fibonnaci series till nth term
    public static void series(int n, int a, int b, int c, int d){
        if(d==1){
            System.out.print(0 + "\t");
            series(n-1, a, b, c, d+1);
        }
        else if (n>0) {
            c = a+b;
            a=b;
            b=c;
            System.out.print(c + "\t");
            series(n-1, a, b, c, d);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        series(10, 0, 1, 0, 1);
    }
}
