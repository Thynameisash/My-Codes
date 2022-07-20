import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(mergesortt(nums)));
        System.out.println(Arrays.toString(nums));
    }

    public static int[] mergesortt(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] lefthalf = mergesortt(Arrays.copyOfRange(nums, 0, mid));
        int[] righthalf = mergesortt(Arrays.copyOfRange(nums, mid, nums.length));
        int[] combined = new int[lefthalf.length + righthalf.length];
        combined = merge(lefthalf, righthalf);

        return combined;
    }

    public static int[] merge(int[] lefthalf, int[] righthalf) {
        int[] combined = new int[lefthalf.length + righthalf.length];
        int i = 0, j = 0, k = 0;
        while (i < lefthalf.length && j < righthalf.length) {
            if (lefthalf[i] > righthalf[j]) {
                combined[k] = righthalf[j];
                j++;
                k++;
            } else {
                combined[k] = lefthalf[i];
                i++;
                k++;
            }
        }
        while (i < lefthalf.length) {
            combined[k] = lefthalf[i];
            i++;
            k++;
        }
        while (j < righthalf.length) {
            combined[k] = righthalf[j];
            j++;
            k++;
        }
        return combined;
    }
}
