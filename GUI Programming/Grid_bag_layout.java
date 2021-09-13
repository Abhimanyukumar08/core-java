import java.awt.*;
import javax.swing.*;


public class Grid_bag_layout extends JFrame{
    public static void main(String[]args)
    {
        Grid_bag_layout gb = new Grid_bag_layout();
    }
    public Grid_bag_layout()
    {
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        setLayout(grid);
        setTitle("GRid BAG");
        GridBagLayout lay = new GridBagLayout();
        this.setLayout(lay);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx=0;
        gc.gridy = 0;
        this.add(new Button("Button ONE"),gc);
        gc.gridx=1;
        gc.gridy =0;
        this.add(new Button("Button TWO"),gc);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx =0;
        gc.gridy=1;


        this.add(new Button("Button THIRD"),gc);
        gc.gridx =1;
        gc.gridy=1;

        this.add(new Button("Button FOURTH"),gc);
        gc.gridx =0;
        gc.gridy=2;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridwidth =3;

        this.add(new Button("ButtOn FIVE"),gc);
        setSize(300,400);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }
}
