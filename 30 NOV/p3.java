
//leetcode 647
import java.util.*;

class p3 {
    public static int countsub(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // check even
            count += pal(s, i, i);
            // check odd
            count += pal(s, i, i + 1);
        }
        return count;
    }

    public static int pal(String str, int left, int right) {
        int count = 0;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countsub(s));
        sc.close();
    }
}