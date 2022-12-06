import java.util.*;

class p2 {
    public static String validip(String IP) {
        if (TypeI(IP))
            return "Type-I";// checks for octet or not
        else if (TypeII(IP))
            return "Type-II";// checks for hextet or not
        else
            return "Invalid";// if neither of them it prints invalid
    }

    public static boolean TypeI(String ip) {
        if (ip.length() < 7)
            return false;// length should be atleast 7 since minimum is 0.0.0.1
        if (ip.charAt(0) == '.')
            return false;// dot cant be at start
        if (ip.charAt(ip.length() - 1) == '.')
            return false;// dot cant be at end
        String[] tokens = ip.split("\\.");// spliting and adding them to a array
        if (tokens.length != 4)
            return false;// if there not excatly 4 partt
        for (String token : tokens) {// checking each part
            if (!TypeIstring(token))
                return false;
        }
        return true;
    }

    public static boolean TypeIstring(String token) {// each part of type 1 is checked here
        if (token.startsWith("0") && token.length() > 1)
            return false;// if its something like 034 returns f if its only 0 it doesnt return false
        try {// added try catch block cause test case 9 fails andd return exception instead
             // of printing invalid
            int parsedInt = Integer.parseInt(token);// checking the range
            if (parsedInt < 0 || parsedInt > 255)
                return false;
            if (parsedInt == 0 && token.charAt(0) != '0')
                return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean TypeII(String ip) {
        if (ip.length() < 15)
            return false;// length should be atleast 15 cause minimm willbe 0:0:0:0:0:0:0:0
        if (ip.charAt(0) == ':')
            return false;// cant start with :
        if (ip.charAt(ip.length() - 1) == ':')
            return false;// cant end with :
        String[] tokens = ip.split(":");// adding
        if (tokens.length != 8)
            return false;// checking length
        for (String token : tokens) {
            if (!TypeIIstring(token))
                return false;// checking eac part
        }
        return true;
    }

    public static boolean TypeIIstring(String token) {
        if (token.length() > 4 || token.length() == 0)
            return false;
        char[] chars = token.toCharArray();
        for (char c : chars) {
            boolean isDigit = c >= 48 && c <= 57;
            boolean isUppercaseAF = c >= 65 && c <= 70;
            boolean isLowerCaseAF = c >= 97 && c <= 102;
            if (!(isDigit || isUppercaseAF || isLowerCaseAF))
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String add = sc.next();
        System.out.println(validip(add));
        sc.close();
    }
}