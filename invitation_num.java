public class invitation_num {
    //find the number of ways in which you can invite 'n' people to your party, single or pairs
    public static int party(int n){
        //base case
        if (n<=1) {
            return 1;
        }
        //single
        int way1 = party(n-1);
        //pair
        int way2 = (n-1)*party(n-2);
        return (way1+way2);
    }
    public static void main(String[] args) {
        System.out.println(party(4));
    }
}
