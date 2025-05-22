import javax.swing.JFrame;

public class GameWindow {
    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel) {
        jFrame = new JFrame();
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);

        jFrame.setVisible(true); // setVisible needs to be at the bottom to avoid problems with repaint/black screen
    }
}
