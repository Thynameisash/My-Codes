class checkexcept extends Exception {
    public static void main(String ag[]) {
        int i;
        int ans = 0;
        int s[] = new int[5];
        try {
            for (i = 0; i < s.length; i++) {
                s[i] = Integer.parseInt(ag[i]);
                if (ag.length < 5) {
                    throw new checkexcept();
                } else if (ag.length > 5) {
                    throw new checkexcept();
                }
            }
            for (i = 0; i < s.length; i++) {
                ans = ans + s[i];
            }
        } catch (checkexcept m) {
            System.out.println("Passed 5 Integer");
        }
        System.out.println("The sum is" + ans);
    }
}
