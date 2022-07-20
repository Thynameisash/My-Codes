public class except {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int x = 1 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        try {
            // ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        try {
            // ArrayStoreException
            String[] arr = new String[5];
            arr[0] = "Hello";
            arr[1] = "World";
            arr[2] = "!";
            System.out.println(arr[3]);
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException");
        }
        try {
            // ClassCastException
            Object obj = new Integer(10);
            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }
        try {
            // NegativeArraySizeException
            int[] arr = new int[-1];
            System.out.println(arr[0]);
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException");
        }
        try {
            // NullPointerException
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        try {
            // NumberFormatException
            int x = Integer.parseInt("abc");
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}
