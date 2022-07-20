import java.awt.*;

public class choice {
    choice() {
        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(100, 100, 75, 75);
        c.add("Linux");
        c.add("Google Chrome");
        f.add(c);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new choice();
    }
}
