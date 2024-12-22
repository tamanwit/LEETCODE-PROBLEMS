public class reverse_str {
    //reverse a string
    public static void rev(String s, int index){
        if(index==0){
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        rev(s, index-1);
    }
    public static void main(String[] args) {
        rev("abcd", 3);
    }
}
