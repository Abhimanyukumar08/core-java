import java.awt.*;




public class FrameExample {
 //public panel pan
 public Frame f= new Frame("I'm with panel");
 
 public void lauchFrame()
 {
     f.setSize(200,150);
     f.setLayout(null); //use default layout
     f.setBackground(Color.yellow);

     f.setVisible(true);
 }
 public static void main(String[]args){
     FrameExample gui = new FrameExample();
     gui.lauchFrame();
    
 }
}
