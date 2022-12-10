import java.util.*;

class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = 0, y = 0, sum = 0;
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i) == a.charAt(j)) {
                    y = a.indexOf(a.charAt(j));
                    sum += Math.abs(y - x);
                    x = y;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}