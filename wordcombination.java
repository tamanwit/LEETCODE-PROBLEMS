import java.util.*;
public class wordcombination {
    static void comb(String str, String c){
        char ch;
        String w="";
        if (str.length() == 0) {
			System.out.print(c + " ");
			return;
		}
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            w = str.substring(0, i) + str.substring(i+1);
            comb(w, c+ch);
        }
    }
    public static void main(String[] args) {
        String str = "TOP";
        comb(str, "");
    }
}
