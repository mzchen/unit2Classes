import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
/**
 * Write a description of class Targat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Targat
{
    public void draw(Graphics2D g2)
    {
        int xLeft = x;
        int yTop = y;
    
        Ellipse2D.Double target4
                = new Ellipse2D.Double(xLeft +10, yTop+20, 10, 10);
        Ellipse2D.Double target3
                = new Ellipse2D.Double(xLeft +20, yTop+20, 10, 10);
        Ellipse2D.Double target2
                = new Ellipse2D.Double(xLeft +30, yTop+20, 10, 10);
        Ellipse2D.Double target1
                = new Ellipse2D.Double(xLeft +40, yTop+20, 10, 10);
        }
    }
    