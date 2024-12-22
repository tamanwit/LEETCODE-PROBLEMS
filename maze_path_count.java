public class maze_path_count {
    //count the number of total path in a maze to move from (0,0) to (n,m)
    //we can go only by moving : 1. right & 2. downwards
    public static int Countmaze(int i, int j, int n, int m){
        //base case
        if(i==n || j==n){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int down = Countmaze(i+1, j, n, m);
        //movement right
        int right = Countmaze(i, j+1, n, m);
        return (down+right);
    }
    public static void main(String[] args) {
        System.out.println(Countmaze(0, 0, 3, 3));
    }
}
