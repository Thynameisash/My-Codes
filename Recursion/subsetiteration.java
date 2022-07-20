import java.util.ArrayList;
import java.util.List;

public class subsetiteration {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(sub(nums));
    }

    public static List<List<Integer>> sub(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
