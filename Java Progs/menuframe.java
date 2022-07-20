import javax.swing.*;
import java.awt.event.*;

class menuframe implements ActionListener {
    menuframe() {
        JFrame fr = new JFrame();
        fr.setSize(400, 400);
        fr.setLayout(null);
        JTextArea ta = new JTextArea();
        ta.setBounds(0, 0, fr.getWidth(), fr.getHeight());
        fr.add(ta);
        JMenuBar bar = new JMenuBar();
        fr.setJMenuBar(bar);
        JMenu m = new JMenu("Language");
        m.setMnemonic(KeyEvent.VK_R);
        JMenu n = new JMenu("Compile and Run");
        bar.add(m);
        bar.add(n);
        JMenuItem m1 = new JMenuItem("Java");
        m.add(m1);
        JMenuItem m2 = new JMenuItem("C++");
        m.add(m2);
        JMenuItem m3 = new JMenuItem("Python");
        m.add(m3);
        JMenuItem n1 = new JMenuItem("Compile");
        JMenuItem n2 = new JMenuItem("Run");
        JMenuItem n3 = new JMenuItem("Debug");
        n.add(n1);
        n.add(n2);
        n.add(n3);
        fr.setVisible(true);
    }

    public static void main(String s[]) {
        new menuframe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
