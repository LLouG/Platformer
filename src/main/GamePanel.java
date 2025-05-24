import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    public GamePanel() {
        addKeyListener(new KeyboardInputs());
        addMouseListener(new MouseInputs());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // this is basically cleaning up stuff from the previous frame

        int xpos = 300;
        int ypos = 300;
        g.fillRect(xpos, ypos, 20, 20);
    }
}
