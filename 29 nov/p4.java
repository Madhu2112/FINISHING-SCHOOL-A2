import java.util.*;

class p4 {
    public static List<String> pos(String s) {
        List<String> result = new ArrayList<String>();
        if (s == null) {
            return result;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == '+') {
                arr[i] = '-';
                arr[i + 1] = '-';
                result.add(new String(arr));
                arr[i] = '+';
                arr[i + 1] = '+';
            }
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pos(s));
    }
}