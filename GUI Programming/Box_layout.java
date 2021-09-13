import java.awt.*;
import javax.swing.*;

public class Box_layout extends Frame {
    Button button[];
    public Box_layout()
    {
        button=new Button[5];

        for(int i =0;i<5;i++)
        {
            button[i] = new Button("button " +(i+1));
            add(button[i]);

        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); //X_AXIS
        setSize(450,450);
        setVisible(true);

    }

    public static void main(String[]args)
    {
        Box_layout bl= new Box_layout();

    }

}
