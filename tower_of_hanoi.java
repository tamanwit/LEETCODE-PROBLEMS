public class recursion5 {
    //tower of hanoi
    public static void hanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer dic : " + n + " from " + src+" to "+dest);
            return;
        }
        //transfer n-1 discs to helper
        hanoi(n-1, src, dest, helper);
        System.out.println("transfer dic : " + n + " from" + src+" to"+dest);
        //transfer n-1 discs from helper to dest using source as helper
        hanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=2;
        hanoi(n, "S", "H", "D");
    }
}
