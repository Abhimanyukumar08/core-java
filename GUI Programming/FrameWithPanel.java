import java.awt.*;

import javax.swing.plaf.PanelUI;

public class FrameWithPanel
{
    private Frame f;
    FrameWithPanel(String title)
    {
        f = new Frame(title);
    }
    public void launchframe()
    {
        f.setSize(200,200);
        f.setLayout(null);
        f.setBackground(Color.blue);

        Panel pan = new Panel();
        pan.setSize(100,100);
        pan.setBackground(Color.yellow);
        f.add(pan);
        f.setVisible(true);

    }
    public static void main(String[]args)
    {
        FrameWithPanel GUI = new FrameWithPanel("Frame with Panel");
        GUI.launchframe();
    }
}