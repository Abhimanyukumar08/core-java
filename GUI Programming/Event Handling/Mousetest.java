import java.awt.*;
import java.awt.event.*;



public class Mousetest implements MouseListener,MouseMotionListener {
    
    Frame f;
    Label l;
    Panel p;
    public Mousetest()
    {
        f = new Frame("Mouse Test");
        l=new Label("");
        p = new Panel();
        f.add(p,BorderLayout.CENTER);
        f.add(l,BorderLayout.NORTH);

        p.addMouseListener(this);
        p.addMouseMotionListener(this);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);

        f.setSize(1000,500);
        f.setVisible(true);

    }
    public void mousePressed(MouseEvent me)
    {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent me)
    {
        l.setText("Mouse Released");
    }
    public void mouseClicked(MouseEvent me)
    {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent me)
    {
        p.setBackground(Color.red);
    }
    public void mouseExited(MouseEvent me)
    {
        p.setBackground(Color.blue);
    
    }
    public void mouseMoved(MouseEvent m)
    {
        l.setText(m.getX()+ " " +m.getY());
    }
    public void mouseDragged(MouseEvent m)
    {
        l.setText("Mouse Dragged");
    }
    public static void main(String[]args)
    {
        Mousetest mt = new Mousetest();
    }
}
