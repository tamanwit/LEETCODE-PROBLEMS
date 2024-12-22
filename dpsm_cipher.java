import java.util.*;
public class dpsm_cipher {
    public static void main(String[] args) {
        String key = "crazy"; int c=1;
        String msg = "mubashir hassain";
        key  = key.toUpperCase();
        int kl = key.length();
        int loc[] = new int[kl];
        for(int i=0; i<kl; i++){
            for(int j=0; j<kl; j++){
                if(key.charAt(i)>key.charAt(j)){
                    c++;
                }
            }
            loc[i] = c;
            c=1;
        }
        //inserting msg into array
        ArrayList<ArrayList<Character>> matrix = new ArrayList<>();
        char[] characters = msg.toCharArray();
        for(char ch:characters){
            //if space present
            if(ch == ' '){
                ch = '.';
            }
            //check if the arraylist is at the end or not
            if(matrix.isEmpty() || !matrix.get(matrix.size()-1).isEmpty()){
                matrix.add(new ArrayList<>());
            }
            //add character to the last row
            matrix.get(matrix.size()-1).add(ch);
        }
        //printing the matrix
        for(ArrayList<Character> row : matrix){
            for(char ch : row){
                System.out.print(ch + "\t");
            }
        }
    }
}
