public class dupliword {
    public static void main(String[] args) {
        String s = ("Hello I am Hello all all");
        String w[] = s.split(" ");
        for (int i = 0; i <= w.length - 1; i++) {
            for (int j = i + 1; j <= w.length - 1; j++) {
                if (w[i].equals(w[j])) {
                    System.out.println("Duplicate word : " + w[i]);
                }
            }
        }
    }
}
