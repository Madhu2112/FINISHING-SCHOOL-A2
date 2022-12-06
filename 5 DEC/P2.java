import java.util.*;

class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        int a[][] = new int[r][c];
        // int prev = a[r - 1][c - 1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            shift(a, r, c);
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void shift(int a[][], int r, int c) {
        int prev = a[r - 1][c - 1];
        int curr = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                curr = a[i][j];
                a[i][j] = prev;
                prev = curr;
            }
        }
    }
}