class num_of_tiles{
    //total ways to place tiles of size (1 x m) in a floor of size n x m
    public static int tiles(int n, int m){
        //base case
        if (n==m) {
            return 2;
        }
        if (n<m) {
            //we can only place horizontally
            return 1;
        }
        //vertically placing
        int vertical = tiles(n-m, m);
        //horizontal palcing
        int horizontal = tiles(n-1, m);
        return (vertical+horizontal);
    }
    public static void main(String[] args) {
        System.out.println(tiles(4, 2));
    }
}
