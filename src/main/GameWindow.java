import javax.swing.*;

public class GameWindow {

    public GameWindow(GamePanel gamePanel) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setTitle("Most Generic Platformer Ever");
        jFrame.setLocationRelativeTo(null);

        jFrame.setVisible(true); // setVisible needs to be at the bottom to avoid problems with repaint/black screen
    }
}
