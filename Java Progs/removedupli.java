import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class removedupli {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 7, 8, 9, 9, 9));
        System.out.println("Old ArrayList: " + al);

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(al);
        al.clear();
        al.addAll(set);

        System.out.println("New ArrayList: " + al);
    }
}