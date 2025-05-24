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

        int xpos = 0;
        int ypos = 0;
        g.fillRect(300 + xpos, 300 + ypos, 20, 20);
    }
}
