import java.util.*;

class p1 {
    static int n;

    static void convert(int arr[][]) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flag) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.printf("%d ", arr[i][j]);
                }
            }

            flag = !flag;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        convert(a);
        sc.close();
    }
}