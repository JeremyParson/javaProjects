import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.awt.Frame;
import javax.swing.JFrame;

public class Main{

    public static void main(String args[]){
        JFrame enviorment = new JFrame("Physics Engine");
        enviorment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        enviorment.pack();
        enviorment.setVisible(true);
    }
    
}