import java.util.*;

class p1 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(get(sc.next(), sc.next()));
        sc.close();
    }

    static String get(String s, String x) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < x.length(); i += 2) {
            int n = Integer.valueOf(x.substring(i, i + 2));
            ans.append(s.charAt(n - 1));
        }
        return ans.toString();
    }
}