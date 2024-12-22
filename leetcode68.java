//text justification
import java.util.*;
public class leetcode68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maxwidth : ");
        int maxWidth = sc.nextInt();
        //array of words
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        //counter
        int c=0, k;
        for(int i=0; i<words.length; i++){
            String s = words[i];
            if(c+s.length() > maxWidth){
                k = maxWidth-c; //to count the remaining gaps an fill them accordingly with spaces
                System.out.println();
                c=0;
                i=i-1;
            }
            else{
                c+=s.length()+1;
                System.out.print(s+" ");
            }
        }
    }
}
