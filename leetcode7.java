import java.util.*;
class leetcode12{
    //Integer to Roman
    /*
     * RULES::
     * I-1
     * V-5
     * X-10
     * L-50
     * C-100
     * M-1000
     * more than this number is invalid
     */
    public static String roman(int n){
        String ones[] = {"", "I","II","III","IV", "V","VI","VII","VIII", "IX","X"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hd[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String th[] = {"","M","MM","MMM"};
        return(th[n/1000] + hd[(n%1000)/100] + tens[(n%100)/10] + ones[(n%10)]);
    }
    public static void main(String[] args) {
        System.out.println(roman(3800));
    }
}
