import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int size = arr.length;
        ssort(arr, 1, size);
        System.out.println(Arrays.toString(arr));
    }

    public static void ssort(int[] nums, int index, int size) {
        if (index == size)
            return;
        int curr = nums[index];
        int j = index - 1;
        while (j >= 0) {
            if (curr < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            } else
                break;
        }
        nums[j + 1] = curr;
        ssort(nums, index + 1, size);
    }
}
