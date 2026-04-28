import javax.swing.*;

public class GUIDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("GUI");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,400);
        JButton pressButton = new JButton("Click me");
        jFrame.getContentPane().add(pressButton);
        jFrame.setVisible(true
        );
    }
}
