import java.util.*;

public class rps {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Rock");
        al.add("Paper");
        al.add("Scissor");
        int min = 1;
        int max = 2;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        System.out.print(al.get(value - 1));
    }
}
