import java.util.*;

class sol {
    public static void main(String args[]) {
        int flag = 2;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        // vow={'A','a','I','i','E','e','O','o','U','u'};
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o'
                    || ch == 'U' || ch == 'u') {

                if (flag != 1 || flag == 2) {
                    sb.append('V');
                }
                flag = 1;
            } else {
                if (flag != 0 || flag == 2) {
                    sb.append('C');
                }
                flag = 0;
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}