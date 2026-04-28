import javax.swing.*;
import java.awt.*;

public class ChatDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Chat Screen");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,400);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(editMenu);
        JMenuItem fileMenu1 = new JMenuItem("new file");
        JMenuItem fileMenu2 = new JMenuItem("save file");
        JMenuItem editMenu1 = new JMenuItem("Undo");
        JMenuItem editMenu2 = new JMenuItem("Copy");
        JMenuItem editMenu3 = new JMenuItem("Paste");
        fileMenu.add(fileMenu1);
        fileMenu.add(fileMenu2);
        editMenu.add(editMenu1);
        editMenu.add(editMenu2);
        editMenu.add(editMenu3);
        JTextArea textArea = new JTextArea();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Please Enter Text");
        JTextField textField = new JTextField(25);
        JButton btn_send = new JButton("Send");
        JButton btn_reset = new JButton("Reset");
        JCheckBox checkBox_m = new JCheckBox("Male");
        JCheckBox checkBox_f = new JCheckBox("Female");
        J
        panel.add(label);
        panel.add(textField);
        panel.add(btn_send);
        panel.add(btn_reset);
        panel.add(checkBox_m);
        panel.add(checkBox_f);
        jFrame.getContentPane().add(BorderLayout.SOUTH, panel);
        jFrame.getContentPane().add(BorderLayout.NORTH,menuBar);
        jFrame.getContentPane().add(BorderLayout.CENTER,textArea);
        jFrame.setVisible(true);
    }
}
