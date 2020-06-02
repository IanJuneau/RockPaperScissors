package Graphics;

import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {


    //public void paint(Graphics g) {
       // g.fillOval(100, 100, 200, 200);
    //}

    public Window(){
        JFrame frame = new JFrame("Name");
        Window window = new Window();
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(window);
    }

}
