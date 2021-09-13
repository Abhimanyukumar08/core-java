import java.awt.*;
import javax.swing.*;

import static javax.swing.GroupLayout.Alignment;
public class Group_layoutEXp {
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("Group Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container mypanel = frame.getContentPane();


        GroupLayout gl = new GroupLayout(mypanel);
        gl.setAutoCreateGaps(true); //use for  creatinf gfap between componenent
        gl.setAutoCreateContainerGaps(true);
        mypanel.setLayout(gl);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");

        gl.setHorizontalGroup(gl.createSequentialGroup()
        .addGroup(gl.createParallelGroup(Alignment.LEADING).addComponent(b1).addComponent(b3))
        .addGroup(gl.createParallelGroup(Alignment.TRAILING).addComponent(b2)));

        gl.setVerticalGroup(gl.createSequentialGroup()
        .addGroup(gl.createParallelGroup(Alignment.BASELINE).addComponent(b1).addComponent(b2))
        .addGroup(gl.createParallelGroup(Alignment.BASELINE).addComponent(b3)));

        frame.pack();
        frame.setVisible(true);

    }
}
