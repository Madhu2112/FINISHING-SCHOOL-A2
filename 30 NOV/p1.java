import java.util.*;

class p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ans = a + a;
        if (a.length() != b.length()) {
            System.out.println("false");
        } else if (ans.contains(b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}