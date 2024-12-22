public class recursion14 {
    //print all permutations of a string using recursive technique
    public static void permutations(String str, String per){
        if(str.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currentCh = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr, per+currentCh);
        }
    }
    public static void main(String[] args) {
        permutations("abc", "");
    }
}
