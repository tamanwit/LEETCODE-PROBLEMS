class recursion15{
    //reverse a number be it positive or negative
	public static String rev(String str){
        if(str.length()==0){
            return "";
	    }
	    return str.charAt(str.length()-1) + rev(str.substring(0, str.length()-1));
    }
    public static void main(String[]args){
        int n = -123;
        String str = Integer.toString(Math.abs(n));
        if(n<0){
            System.out.println('-'+rev(str));
        } else{
            System.out.println(rev(str));
        } 
    }
}
