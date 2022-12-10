import java.util.*;

class p2 {
    public static void main(String args[]) {
        Scanner se = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        int m = se.nextInt();
        for (int i = 0; i < m; i++) {
            l1.add(se.nextInt());
        }
        int n = se.nextInt();
        for (int i = 0; i < n; i++) {
            l2.add(se.nextInt());
        }
        int i = 0, j = 0;
        int sum = 0;
        while (i < l1.size() && j < l2.size()) {
            sum = l1.get(i) + l2.get(j);
            if (sum < 9) {
                l3.add(sum);
            } else {
                ArrayList<Integer> ll = new ArrayList<>();
                while (sum > 0) {
                    int w = sum % 10;
                    ll.add(w);
                    sum = sum / 10;
                }
                for (int v = ll.size() - 1; v >= 0; v--) {
                    l3.add(ll.get(v));
                }

            }
            i++;
            j++;
        }
        while (i < l1.size()) {
            l3.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            l3.add(l2.get(j));
            j++;
        }
        for (int q = 0; q < l3.size(); q++) {
            System.out.print(l3.get(q) + " ");
        }
        se.close();
    }
}