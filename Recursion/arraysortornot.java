public class arraysortornot {
    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3 };
        int index = 0;
        System.out.println(check(nums, index));
    }

    public static boolean check(int nums[], int index) {

        if (index == nums.length - 1) {
            return true;
        }
        return nums[index] < nums[index + 1] && check(nums, index + 1);
    }
}
