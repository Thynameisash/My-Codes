public class hello {
    public boolean checkPossibility(int[] nums) {
        int i = 0;
        while (i <= nums.length - 2) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        // int val;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1 && nums[i + 1] > nums[i]) {
                int val = i + 1;
            }
        }
        return false;
    }
}
