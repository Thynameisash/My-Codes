abstract class abs {
    void speakk(String s) {
        System.out.println("Hi, I'm " + s);
    }
}

class animal extends abs {
    public static void main(String[] args) {
        abs a1 = new animal();
        a1.speakk("Dog");
        a1.speakk("Cat");
        a1.speakk("Snake");
    }
}