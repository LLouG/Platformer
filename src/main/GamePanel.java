import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // this is basically cleaning up stuff from the previous frame

        int xpos = 300;
        int ypos = 300;
        g.fillRect(xpos, ypos, 150, 100);
    }
}
