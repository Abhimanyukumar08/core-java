import java.awt.*;
import java.awt.event.*;


public class borderlayout{
    private Frame f ;
    borderlayout()
    {

        f = new Frame();
        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);

        f.setSize(232,342);
        f.setVisible(true);
    
        
    }
    
    
    public static void main(String[]args) {
        borderlayout bl = new borderlayout();
       
    }

}
