    import java.util.*;
    public class leetcode65 {
        public static boolean isNumber(String s) {
            if (s == null || s.length() == 0) {
                return false;
            }

            s = s.trim();
            boolean numberSeen = false;
            boolean pointSeen = false;
            boolean eSeen = false;
            boolean numberAfterE = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if ('0' <= c && c <= '9') {
                    numberSeen = true;
                    numberAfterE = true;
                } else if (c == '.') {
                    if (eSeen || pointSeen) {
                        return false;
                    }
                    pointSeen = true;
                } else if (c == 'e' || c == 'E') {
                    if (eSeen || !numberSeen) {
                        return false;
                    }
                    eSeen = true;
                    numberAfterE = false;
                } else if (c == '-' || c == '+') {
                    if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            return numberSeen && numberAfterE;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string to check if it is a valid number: ");
            String s = sc.next();

            boolean result = isNumber(s);
            if (result) {
                System.out.println("The string is a valid number.");
            } else {
                System.out.println("The string is not a valid number.");
            }
        }
    }
