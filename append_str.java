import java.util.*;
public class recursion9 {
    //move all 'x' to the end of the String
    public static void str(String s, int i, String newstr, int c){
        StringBuilder sb = new StringBuilder(s);
        if(i == sb.length()){
            //adding the 'x'
            for(int j=0; j<c; j++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        if(sb.charAt(i)=='x'){
            c++;
            str(s, i+1, newstr, c);
        }
        else{
            newstr += sb.charAt(i);
            str(s, i+1, newstr, c);
        }
    }
    public static void main(String[] args) {
        str("axbcxxd", 0, "", 0);
    }
}
