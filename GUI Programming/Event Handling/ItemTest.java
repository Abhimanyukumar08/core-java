import java.awt.*;
import  java.awt.event.*;


public class ItemTest implements ItemListener {
    
    Frame f;
    Panel p;
    Label l;
    Choice ch1;
    public ItemTest()
    {
        f=new Frame("ITEM TEST");
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(null);
        l =new Label("Name");
        f.add(l);
        l.setBounds(50,50,80,20);
        

        ch1 = new Choice();
        f.add(ch1);
        ch1.setBounds(130,50,100,20);
        ch1.add("--select--");
        ch1.add("Red");
        ch1.add("Blue");
        ch1.add("Green");
        ch1.add("Yellow");

        ch1.addItemListener(this);

    }
    public static void main(String[]args)
    {
        ItemTest t = new ItemTest();

    }
    public void itemStateChanged(ItemEvent e)
    {
        Object o =e.getSource();
        if(o==ch1)
        {
            int val = ch1.getSelectedIndex();
            if(val==0)
            {
                f.setBackground(Color.white);
            }
            else if(val==1)
            {
                f.setBackground(Color.red);
            }
            else if(val==2)
            {
                f.setBackground(Color.blue);
            }
            else if(val==3)
            {
                f.setBackground(Color.green);
            }
            else if(val==4)
            {
                f.setBackground(Color.yellow);
            }
        }
    }

    
}
