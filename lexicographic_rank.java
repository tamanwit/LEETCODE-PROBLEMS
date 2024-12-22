import java.util.*;
class lexicographic_rank{
    public static int fact(int n){
        if(n==0)
            return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        String str = "acb";
        char arr[] = str.toCharArray();
        Arrays.sort(arr);   //sorting the string stored in a char[]
        char ch;
        int sum=0, n, a, pro=1;
        String s = Arrays.toString(arr);    //sorted string
        s = s.replaceAll("[^a-zA-Z0-9]", "");   //deletes all extra characters
        StringBuilder sb = new StringBuilder(s);
        //compare both the strings
        for(int i=0; i<s.length(); i++){
            if(str.charAt(i) != s.charAt(i)){
                n = s.length()-1-i;
                //position letter difference
                a = Math.abs(str.indexOf(str.charAt(i)) - str.indexOf(s.charAt(i)));
                System.out.println(fact(n) + "\t" + a);
                //note the character to be added
                ch = str.charAt(i);
                //delete the character from sb stringbuidler
                sb.deleteCharAt(s.indexOf(ch));
                //changing the location of the characters
                sb.insert(i, ch);
                s = sb.toString();
                pro = pro + (fact(n)*a);
                System.out.println(s);
            }
            
        }
        System.out.println(pro);
    }
}
