class boxweight extends box {
    boxweight(int a, int b, int c) {
        int volume = a * b * c;
        System.out.println("Volume is " + volume);
    }
}
class box {
    int volume = 100;
    box() {
        System.out.println("Volume is " + volume);
    }
}
class display {
    public static void main(String[] args) {
        boxweight bw = new boxweight(10, 20, 30);
    }
}
