import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setSize(420,420);
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(15,18,36));

        // read the logo
        ImageIcon image = new ImageIcon("logo.jpg");
        this.setIconImage(image.getImage());
    }
}
