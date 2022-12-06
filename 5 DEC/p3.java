import java.util.*;

class p3 {
    public static int maxwgt(int[] nums) {
        int m = 500, n = nums.length, count = 0, sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum < m) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxwgt(nums));
        sc.close();
    }

}