package Graphics;

import Base.*;

import javax.swing.*;
import java.awt.*;

public class Component extends JComponent {
    public void paintComponent(Graphics g){
        Player player = new Player();
        AI ai = new AI();
        Graphics2D g2 = (Graphics2D) g;

        g2.setFont(new Font("serif", Font.PLAIN, 15));
        g2.drawString("Player: ",15,25);
        g2.drawString("AI: ", 350, 25);

        Rectangle rect1 = new Rectangle(15,35,150,200);
        Rectangle rect2 = new Rectangle(350,35,150,200);

        g2.setColor(Color.black);
        g2.fill(rect1);
        g2.fill(rect2);

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("arial", Font.PLAIN, 250));
        g2.drawString(Integer.toString(player.winCount), 15, 225);
        g2.drawString(Integer.toString(ai.winCount), 350, 225);
    }
}
