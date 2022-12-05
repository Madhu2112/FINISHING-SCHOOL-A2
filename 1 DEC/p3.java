
/*import java.util.*;

public class p3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Map<Character, Integer> freq = new HashMap<>();
        for (char l : s.toCharArray()) {
            if (freq.containsKey(l))
                freq.put(l, freq.get(l) + 1);
            else
                freq.put(l, 1);
        }
        Set<Integer> st = new HashSet<>();
        for (int f : freq.values()) {
            st.add(f);
        }
        if (st.size() > 2) {
            System.out.println("false");
        } else if (st.size() == 1) {
            System.out.println("true");
        } else {
            int f1 = 0;
            int f2 = 0;
            int f1c = 0;
            int f2c = 0;
            int i = 0;
            for (int n : st) {
                if (i == 0)
                    f1 = n;
                else
                    f2 = n;
                i++;
            }

            for (int f : freq.values()) {
                if (f == f1)
                    f1c++;
                if (f == f2)
                    f2c++;
            }

            if ((f1 == 1 && f1c == 1) || (f2 == 1 && f2c == 1))
                System.out.println("true");
            else if ((Math.abs(f1 - f2) == 1) && (f1c == 1 || f2c == 1))
                System.out.println("true");
            else
                System.out.println("false");
        }
        input.close();
    }
}*/
import java.util.*;

class p3 {
    public static boolean isTrue(String str) {
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            arr.add(count);
            count = 0;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1)
                arr.remove(i);
        }
        int min = arr.get(0);
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min)
                min = arr.get(i);
            if (arr.get(i) > max)
                max = arr.get(i);
        }
        if (min == max || min == max - 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isTrue(str));
        sc.close();
    }
}
