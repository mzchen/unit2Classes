import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.lang.Object;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
public class Background extends JComponent
{
    private int x;
    private int y;
    private int w;
    private int h;
    
    /**
     * Default constructor for objects of class Building
     */
    public Background(int xpos, int ypos, int width, int height)
    {
       this.x = xpos;
       this.y = ypos;
       this.w = width;
       this.h = height;
    }
    public void draw(Graphics2D g2)
    {
       Rectangle background = new Rectangle(this.x, this.y, this.w, this.h);
       g2.setColor(Color.CYAN);
       g2.draw(background);
       g2.fill(background);
    }
}
