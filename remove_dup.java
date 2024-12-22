public class recursion10 {
    private static boolean[] map = new boolean[26];
    //remove dupilicates from a String
    public static void remove(String s, int i, String newstr){
        if(i == s.length()){
            System.out.println(newstr);
            return;
        }
        if(map[s.charAt(i) - 'a']){
            remove(s, i+1, newstr);
        }
        else{
            newstr+=s.charAt(i);
            map[s.charAt(i)-'a'] = true;
            remove(s, i+1, newstr);
        }
    }
    public static void main(String[] args) {
        remove("abbcccceddfcb",0,"");
    }    
}
