import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 3, 4, 5 };
        int target = 3;
        System.out.println(searchind(nums, target, 0));
        System.out.println(searchlastind(nums, target, nums.length - 1));
        System.out.println(findind(nums, target, 0));
    }

    static boolean search(int[] nums, int target, int index) {
        if (index == nums.length) {
            return false;
        }
        return nums[index] == target || search(nums, target, index + 1);
    }

    static int searchind(int[] nums, int target, int index) {
        if (index == nums.length) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        }
        return searchind(nums, target, index + 1);
    }

    static int searchlastind(int[] nums, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        }
        return searchlastind(nums, target, index - 1);
    }

    static ArrayList<Integer> findind(int[] nums, int target, int index) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (index == nums.length) {
            return al;
        }
        if (nums[index] == target) { 
            al.add(index);
        }
        ArrayList<Integer> belowans = findind(nums, target, index + 1);
        al.addAll(belowans);
        return al;
    }
}
