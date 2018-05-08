import javax.swing.*;

public class Game {
    public static void main(String[] args) {

        JFrame frame = new JFrame("SUPER GAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.add(new GamePanel());
        frame.setVisible(true);

    }
}
