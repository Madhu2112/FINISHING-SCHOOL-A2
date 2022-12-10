import java.util.*;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            String[] s = sc.next().split(",");
            map.put(s[0], s[1]);
        }
        String s = sc.next();
        int c = 0, f = 0;
        ArrayList<String> b = new ArrayList<>();
        for (String k : map.keySet()) {
            if (map.get(k).equals(s)) {
                b.add(k);
                f++;
            }
        }
        if (f == 0) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < b.size(); i++) {
            for (String k : map.keySet()) {
                if (map.get(k).equals(b.get(i))) {
                    b.add(k);
                    c++;
                }
            }
        }
        if (c == 0) {
            System.out.println(b.size());
        } else {
            System.out.println(c);
        }
        sc.close();
    }
}