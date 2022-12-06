import java.util.*;

class sol {
    public static int help(int[] nums, int n) {
        int max = Integer.MIN_VALUE, temp = 1;

        for (int i = 0; i < nums.length; i++) {
            temp *= nums[i];
            max = Math.max(temp, max);
            if (temp == 0)
                temp = 1;
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp *= nums[i];
            max = Math.max(temp, max);
            if (temp == 0)
                temp = 1;
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println(help(list, n));
        sc.close();
    }
}