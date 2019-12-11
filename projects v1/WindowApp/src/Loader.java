import javax.swing.*;
import java.awt.*;

public class Loader
{
    public static void main(String[] args)
    {
    JFrame frame = new JFrame();
    //JFrame.setLocationRelativeTo(null);
    //Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    //frame.setSize(dimension.width, dimension.height);
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setTitle("Our first window application");
    frame.setVisible(true);
    }
}
