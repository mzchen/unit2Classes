import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
public class CarComponenet extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Car car1= new Car(0.0);
        int x = getWidth() -60;
        int y = getHeight() -30;
        Car car2 = new Car(0.0);
        car1.draw(g2);
        car2.draw(g2);
    }
}