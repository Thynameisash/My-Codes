import java.awt.*;

public class awtt {
    awtt() {

        Frame f = new Frame();

        Label n = new Label("Name :", Label.CENTER);
        Label p = new Label("Password :", Label.CENTER);
        n.setBounds(70, 90, 90, 50);
        p.setBounds(70, 140, 90, 50);

        TextField tf1 = new TextField();
        tf1.setBounds(200, 105, 90, 30);

        TextField tf2 = new TextField();
        tf2.setBounds(200, 155, 90, 30);
        tf2.setEchoChar('#');
        Button b = new Button("Submit");
        b.setBounds(120, 200, 60, 40);

        Button b2 = new Button("Cancel");
        b2.setBounds(200, 200, 60, 40);

        f.add(n);
        f.add(p);
        f.add(tf1);
        f.add(tf2);
        f.add(b);
        f.add(b2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new awtt();
    }
}
