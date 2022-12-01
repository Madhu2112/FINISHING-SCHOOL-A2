import java.util.*;

class p2 {
    // static int[][] vis;
    static int count;

    public static void help(int[][] a, int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            count++;
            return;
        } else {
            if (i + 1 < m && a[i + 1][j] == 0) {// down
                help(a, i + 1, j, m, n);
            }
            if (j + 1 < n && a[i][j + 1] == 0) {// forward
                help(a, i, j + 1, m, n);
            }
        }
    }

    public static int findnum(int[][] a, int m, int n) {
        // vis = new int[n][n];
        count = 0;
        help(a, 0, 0, m, n);
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // vis=new int[m][n];
        // count=0;
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();

            }
        }
        int res = findnum(grid, m, n);
        System.out.println(res);
        sc.close();
    }
}