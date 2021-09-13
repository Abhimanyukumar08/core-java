
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ButtonListener {

    private Frame f;
    private Button b;

    public ButtonListener()
    {
        f = new Frame("Test");
        b = new Button("Press me");
        b.setActionCommand("Button PRESSED");
    }

    public void launchfuntion()
    {
        b.addActionListener(new TestButton());
        f.add(b,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
        
    }

    public static void main(String[]args)
    {
        ButtonListener bt =new ButtonListener();
        bt.launchfuntion();
    }
}

