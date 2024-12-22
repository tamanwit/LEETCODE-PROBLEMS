//random expression matching
//leetcode 10 - HARD LEVEL
import java.util.*;
import java.util.regex.*;
class leetcode10{
    public static void main(String[] args) {
        //direct method to check if a string matches a pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original string to match : ");
        String s = sc.next();
        System.out.println("Enter string to match : ");
        String p = sc.next();
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
    }
}
