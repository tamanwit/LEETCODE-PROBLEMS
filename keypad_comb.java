public class recursion13 {
    //print all keypad combinations
    /*
     *  0 -> .
        1 -> abc
        2 -> def
        3 -> ghi
        4 -> jkl
        5 -> mno
        6 -> pqrs
        7 -> tu
        8 -> vwx
        9 -> yz
     */
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void comb(String number, int idx, String res) {
        if(idx == number.length()) {
            System.out.println(res);
            return;
        }
        for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
            char curr = keypad[number.charAt(idx)-'0'].charAt(i);
            comb(number, idx+1, res+curr);
        }
    }
    public static void main(String[] args) {
        comb("23", 0, "");
    }
}
