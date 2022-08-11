import java.util.Arrays;

public class selectionmax {
    public static void main(String[] args) {
        int[] nums = { 9, 8, 6, 5, 2, 1 };
        ssort(nums, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void ssort(int[] nums, int len) {
        if (len == 1)
            return;
        int max = 0, maxind = 0;
        for (int i = 0; i <= len; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxind = i;
            }
        }
        int temp = nums[len];
        nums[len] = max;
        nums[maxind] = temp;
        ssort(nums, len - 1);
    }

}
