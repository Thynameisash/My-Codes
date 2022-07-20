public class permu {
    public static void main(String[] args) throws Exception {
        String str = "wxyz";
        StringBuffer strBuf = new StringBuffer(str);
        doPerm(strBuf, 0);
    }

    private static void doPerm(StringBuffer str, int index) {
        if (index == str.length())
            System.out.println(str);
        else {
            doPerm(str, index + 1);
            for (int i = index + 1; i < str.length(); i++) {
                swap(str, index, i);
                doPerm(str, index + 1);
                swap(str, i, index);
            }
        }
    }

    private static void swap(StringBuffer str, int pos1, int pos2) {
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);
    }

}
