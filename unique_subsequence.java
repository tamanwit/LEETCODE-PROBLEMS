import java.util.*;
public class recursion12 {
    //print all the unique subsequences of a String
    /*
     * for example, let's say the string is "aaa"
     * then output --> aa
     *                  a
     * to solve this porblem we need to use a DS known as HashSet
     */
    public static void uniqueSub(String str, int i, String newstr, HashSet<String> set){
        if(i==str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        //to be
        uniqueSub(str, i+1, newstr+str.charAt(i), set);
        //not to be
        uniqueSub(str, i+1, newstr, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSub("aaa", 0, "", set);
    }
}
