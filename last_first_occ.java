public class recursion7 {
    //1st and last occurence of an element
    public static int first =-1;
    public static int last=-1;
    public static void chk(String s, int index, char element){
        //base class
        if(index == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = s.charAt(index);
        if (currchar==element) {
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        chk(s, index+1, element);
    }
    public static void main(String[] args) {
        chk("abaacdaefaah", 0, 'a');
    }
}
