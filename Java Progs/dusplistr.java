public class dusplistr {
    public static void main(String[] args) {
        String str = "househome";
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < inp.length; i++) {
            for (int j = i + 1; j < inp.length; j++) {
                if (inp[i] == inp[j]) {
                    System.out.print(inp[j] + " ");
                    break;
                }
            }
        }
    }
}
