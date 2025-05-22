import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
    private int xpos = 300;
    private int ypos = 300;

    public GamePanel() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // this is basically cleaning up stuff from the previous frame

        g.drawRect(xpos, ypos, 150, 100);
    }
}
