import java.util.Arrays;

public class selectionmin {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 9, 1, 2, 3, 68, 7, 0 };
        System.out.println(Arrays.toString(sort(nums, 0)));
    }

    public static int[] sort(int[] nums, int startindex) {
        if (startindex >= nums.length - 1) {
            return nums;
        }
        int minind = startindex;
        for (int i = startindex + 1; i <= nums.length - 1; i++) {
            if (nums[i] < nums[minind]) {
                minind = i;
            }
        }
        int temp = nums[startindex];
        nums[startindex] = nums[minind];
        nums[minind] = temp;
        return sort(nums, startindex + 1);
    }
}
