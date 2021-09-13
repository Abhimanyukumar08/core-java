import java.awt.event.*;


public class TestButton implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("ACtion ocurred");
        System.out.println("Button's command is " +e.getActionCommand());
    }


}

