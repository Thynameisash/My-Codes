import java.util.HashMap;
import java.util.Scanner;

public class wordoccur {
    public static void main(String[] args) {
        count();
    }

    public static void count() {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String[] newstr = s.split(" ");
        // System.out.println(Arrays.toString(newstr));
        HashMap<String, Integer> hs = new HashMap<>();
        for (int i = 0; i <= newstr.length - 1; i++) {
            hs.put(newstr[i], hs.getOrDefault(newstr[i], 0) + 1);
        }
        String res = " ";
        for (String k : hs.keySet()) {
            if (hs.get(k) > max) {
                res = k;
                max = hs.get(k);
            }
        }
        System.out.println(res);
        sc.close();
    }
}
