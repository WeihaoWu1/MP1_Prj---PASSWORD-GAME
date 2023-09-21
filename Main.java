import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {

    JFrame frame = new JFrame(); // creating instance of JFrame
    JButton button = new JButton(" Click");
        String name = JOptionPane.showInputDialog("What is your name? ");
        UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
        JOptionPane.showMessageDialog(null,"Hello: " + name);
        //question.setBounds(100, 100, 100, 100);
        button.setBounds(500, 200, 220, 50); // x axis, y-axis, width, height
        frame.add(button); // adding button in JFrame
        frame.setSize(1000, 1000); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); // making the frame visible

    }
}





