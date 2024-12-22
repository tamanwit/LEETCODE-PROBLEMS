public class recursion11 {
    //all subsequences of a string
    /**
     * suppose the given string is --> "abc"
     * then, the susbsequences shall be, [subsequence is different from the printing of all possible permutations]
     * abc
     * ab
     * ac
     * a
     * bc
     * b
     * c
     * inshort, it is a tree program
     */
    public static void sub(String s, int i, String newstr){
        //base case
        if(i == s.length()){
            System.out.println(newstr);
            return;
        }
        //to be
        sub(s, i+1, newstr+s.charAt(i));
        //not to be
        sub(s, i+1, newstr);
    }
    public static void main(String[] args) {
        sub("abc", 0, "");
    }
}
