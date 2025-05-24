import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {
        MouseInputs mouseInputs = new MouseInputs();

        addKeyListener(new KeyboardInputs());
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // this is basically cleaning up stuff from the previous frame

        int xpos = 300;
        int ypos = 300;
        g.fillRect(xpos, ypos, 20, 20);
    }
}
