import java.awt.*;
import java.awt.event.*;

public class MenuBAR implements ActionListener,ItemListener {
    
    private Frame f;
    private MenuBar mb;
    private Menu m1;
    private Menu m2;
    private Menu m3;
    private MenuItem  mi1;
    private MenuItem mi2;
    private MenuItem mi3;
    private MenuItem mi4;

    private CheckboxMenuItem mi5;

    private void go()
    {
        f = new Frame("Menu BAR");
        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        mb.add(m1);
        mb.add(m2);
        mb.setHelpMenu(m3);
        f.setMenuBar(mb);

        mi1 = new MenuItem("New");
        mi2 = new MenuItem("Save");
        mi3 = new MenuItem("Load");
        mi4 = new MenuItem("Quit");
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);

        mi5 = new CheckboxMenuItem("Presistent");
        mi5.addActionListener(this);
        m1.add(mi5);

        f.setSize(400,400);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        System.out.println("Button " + ae.getActionCommand() +"\" pressed ");
        if(ae.getActionCommand().equals("Quit")){
            System.exit(0);
        }
    }
    public void itemStateChanged(ItemEvent e)
    {
        String state = "deselected";
        if(e.getStateChange()==ItemEvent.SELECTED)
        {
            state = "Selected";

        }
        System.out.println(e.getItem()+ " " +state);
    }
    public static void main(String[]args){
        MenuBAR m = new MenuBAR();
        m.go();
    }

}
 