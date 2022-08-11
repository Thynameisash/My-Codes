import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] nums = { 10, 11, 12, 9, 8, 6, 5, 2, 1 };
        bsort(nums, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void bsort(int[] nums, int len) {
        if (len == 0)
            return;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        bsort(nums, len - 1);
    }
}
