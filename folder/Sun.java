import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.lang.Object;
import javax.swing.JComponent;

/**
 * 
 * @Michael Chen (your name) 
 */
public class Sun extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private int w;
    private int h;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int xpos, int ypos, int width, int height)
    {
       this.x = xpos;
       this.y = ypos;
       this.w = width;
       this.h = height;
    }

    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double sun = new Ellipse2D.Double(this.x, this.y, this.w, this.h);
       g2.setColor(Color.YELLOW);
       g2.draw(sun);
       g2.fill(sun);
    }
    }

