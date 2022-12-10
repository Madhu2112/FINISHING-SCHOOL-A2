import java.util.*;

class p3 {
    public static int luckyNumber(int[][] nums) {
        int a = nums.length, b = nums[0].length, ans = -1;
        int[] row = new int[a];
        int[] col = new int[b];
        Arrays.fill(row, Integer.MIN_VALUE);
        Arrays.fill(col, Integer.MAX_VALUE);
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                row[x] = Math.max(row[x], nums[x][y]);
                col[y] = Math.min(col[y], nums[x][y]);
            }
        }
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                if (nums[x][y] == row[x] && nums[x][y] == col[y]) {
                    ans = nums[x][y];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[][] nums = new int[a][b];
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                nums[x][y] = sc.nextInt();
            }
        }
        System.out.println(luckyNumber(nums));
        sc.close();
    }
}