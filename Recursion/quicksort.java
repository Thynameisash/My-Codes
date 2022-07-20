import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 9, 1, 2, 3, 68, 7, 0 };
        qs(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void qs(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        int pivot = nums[mid];
        if (start >= end) {
            return;
        }
        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[start] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        qs(nums, start, mid);
        qs(nums, mid + 1, end);
    }
}
