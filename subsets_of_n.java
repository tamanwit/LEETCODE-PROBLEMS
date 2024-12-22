import java.util.ArrayList;

public class subsets_of_n {
    //print all subsets of a set of first n natural numbers
    public static void printsubset(ArrayList<Integer> set){
        for(int i=0; i<set.size(); i++){
            System.out.print(set.get(i) + "\t");
        }
        System.out.println();
    }
    public static void subset(int n, ArrayList<Integer> set){
        //base case
        if(n==0){
            printsubset(set);
            return;
        }
        //add hbe
        set.add(n);
        subset(n-1, set);
        //add hbe na
        set.remove(set.size()-1);
        subset(n-1, set);
    }
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        subset(3, set);
    }
}
