import java.awt.*;



public class FlowLAYOUT {
    private Frame f;
    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;

    public FlowLAYOUT()
    {
        f = new Frame("Flow Layout");
        B1 = new Button("OK");
        B2 = new Button("OPEN");
        B3 = new Button("CLOSE");
        B4 = new Button("NEXT");

    }
    public void launchframe()
    {
        f.setLayout(new FlowLayout());
        f.add(B1);
        f.add(B2);
        f.add(B3);
        f.add(B4);
        f.pack(); //this method is used to sizes the frame so all contents are at or above their size

        f.setSize(100,190);
        f.setVisible(true);

    }
    public static void main(String[]args)
    {
        FlowLAYOUT FL  = new FlowLAYOUT();
        FL.launchframe();
    }

}