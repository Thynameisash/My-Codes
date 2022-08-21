import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] nums = { 9, 8, 6, 5, 2, 1 };
        System.out.println(Arrays.toString(msort(nums)));
    }

    public static int[] msort(int[] nums) {
        if (nums.length == 1)
            return nums;

        int mid = nums.length / 2;
        int[] left = msort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = msort(Arrays.copyOfRange(nums, mid, nums.length));
        int[] combined = mergenums(left, right);

        return combined;
    }

    public static int[] mergenums(int[] left, int[] right) {
        int[] combined = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                combined[k] = left[i];
                i++;
                k++;
            } else {
                combined[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            combined[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            combined[k] = right[j];
            j++;
            k++;
        }
        return combined;
    }
}
