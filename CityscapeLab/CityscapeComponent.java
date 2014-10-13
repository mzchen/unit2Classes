import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // create instances of classes and invoke the draw method on each
        // ...
        int x1=0;
        int y1=0;
        Building dingus = new Building(40,60,200,400);
        dingus.draw(g2);
        Window dingus2 = new Window(50,70,20,20);
        dingus2.draw(g2);
        Window dingus3 = new Window(80,70,20,20);
        dingus3.draw(g2);
        Window dingus4 = new Window(110,70,20,20);
        dingus4.draw(g2);
        Window dingus5 = new Window(140,70,20,20);
        dingus5.draw(g2);
        Window dingus6 = new Window(170,70,20,20);
        dingus6.draw(g2);
        Window dingus7 = new Window(200,70,20,20);
        dingus7.draw(g2);
        
        Window dingus8 = new Window(50,100,20,20);
        dingus8.draw(g2);
        Window dingus9 = new Window(80,100,20,20);
        dingus9.draw(g2);
        Window dingus10 = new Window(110,100,20,20);
        dingus10.draw(g2);
        Window dingus11 = new Window(140,100,20,20);
        dingus11.draw(g2);
        Window dingus12 = new Window(170,100,20,20);
        dingus12.draw(g2);
        Window dingus13 = new Window(200,100,20,20);
        dingus13.draw(g2);
        
        Window dingus14 = new Window(50,130,20,20);
        dingus14.draw(g2);
        Window dingus15 = new Window(80,130,20,20);
        dingus15.draw(g2);
        Window dingus16 = new Window(110,130,20,20);
        dingus16.draw(g2);
        Window dingus17 = new Window(140,130,20,20);
        dingus17.draw(g2);
        Window dingus18 = new Window(170,130,20,20);
        dingus18.draw(g2);
        Window dingus19 = new Window(200,130,20,20);
        dingus19.draw(g2);
        
        Window dingus20 = new Window(50,160,20,20);
        dingus20.draw(g2);
        Window dingus21 = new Window(80,160,20,20);
        dingus21.draw(g2);
        Window dingus22 = new Window(110,160,20,20);
        dingus22.draw(g2);
        Window dingus23 = new Window(140,160,20,20);
        dingus23.draw(g2);
        Window dingus24 = new Window(170,160,20,20);
        dingus24.draw(g2);
        Window dingus25 = new Window(200,160,20,20);
        dingus25.draw(g2);
        
        Window dingus26 = new Window(50,160,20,20);
        dingus26.draw(g2);
        Window dingus27 = new Window(80,160,20,20);
        dingus27.draw(g2);
        Window dingus28 = new Window(110,160,20,20);
        dingus28.draw(g2);
        Window dingus29 = new Window(140,160,20,20);
        dingus29.draw(g2);
        Window dingus30 = new Window(170,160,20,20);
        dingus30.draw(g2);
        Window dingus31 = new Window(200,160,20,20);
        dingus31.draw(g2);
        
        Window dingus32 = new Window(50,190,20,20);
        dingus32.draw(g2);
        Window dingus33 = new Window(80,190,20,20);
        dingus33.draw(g2);
        Window dingus34 = new Window(110,190,20,20);
        dingus34.draw(g2);
        Window dingus35 = new Window(140,190,20,20);
        dingus35.draw(g2);
        Window dingus36 = new Window(170,190,20,20);
        dingus36.draw(g2);
        Window dingus37 = new Window(200,190,20,20);
        dingus37.draw(g2);
        
        y1 = 150;
        x1 = 0;
        
        Window dingus42 = new Window(50,70+y1,20,20);
        dingus42.draw(g2);
        Window dingus43 = new Window(80,70+y1,20,20);
        dingus43.draw(g2);
        Window dingus44 = new Window(110,70+y1,20,20);
        dingus44.draw(g2);
        Window dingus45 = new Window(140,70+y1,20,20);
        dingus45.draw(g2);
        Window dingus46 = new Window(170,70+y1,20,20);
        dingus46.draw(g2);
        Window dingus47 = new Window(200,70+y1,20,20);
        dingus47.draw(g2);
        
        y1 = y1+30;
        
        Window dingus52 = new Window(50,70+y1,20,20);
        dingus52.draw(g2);
        Window dingus53 = new Window(80,70+y1,20,20);
        dingus53.draw(g2);
        Window dingus54 = new Window(110,70+y1,20,20);
        dingus54.draw(g2);
        Window dingus55 = new Window(140,70+y1,20,20);
        dingus55.draw(g2);
        Window dingus56 = new Window(170,70+y1,20,20);
        dingus56.draw(g2);
        Window dingus57 = new Window(200,70+y1,20,20);
        dingus57.draw(g2);
        
        y1=y1+30;
        
        Window dingus62 = new Window(50,70+y1,20,20);
        dingus62.draw(g2);
        Window dingus63 = new Window(80,70+y1,20,20);
        dingus63.draw(g2);
        Window dingus64 = new Window(110,70+y1,20,20);
        dingus64.draw(g2);
        Window dingus65 = new Window(140,70+y1,20,20);
        dingus65.draw(g2);
        Window dingus66 = new Window(170,70+y1,20,20);
        dingus66.draw(g2);
        Window dingus67 = new Window(200,70+y1,20,20);
        dingus67.draw(g2);
        
        y1 = y1+30;
        Window dingus72 = new Window(50,70+y1,20,20);
        dingus72.draw(g2);
        Window dingus73 = new Window(80,70+y1,20,20);
        dingus73.draw(g2);
        Window dingus74 = new Window(110,70+y1,20,20);
        dingus74.draw(g2);
        Window dingus75 = new Window(140,70+y1,20,20);
        dingus75.draw(g2);
        Window dingus76 = new Window(170,70+y1,20,20);
        dingus76.draw(g2);
        Window dingus77 = new Window(200,70+y1,20,20);
        dingus77.draw(g2);
        y1=y1+30;
        Window dingus82 = new Window(50,70+y1,20,20);
        dingus82.draw(g2);
        Window dingus83 = new Window(80,70+y1,20,20);
        dingus83.draw(g2);
        Window dingus84 = new Window(110,70+y1,20,20);
        dingus84.draw(g2);
        Window dingus85 = new Window(140,70+y1,20,20);
        dingus85.draw(g2);
        Window dingus86 = new Window(170,70+y1,20,20);
        dingus86.draw(g2);
        Window dingus87 = new Window(200,70+y1,20,20);
        dingus87.draw(g2);
        y1 =y1+30;
        
        Window dingus92 = new Window(50,70+y1,20,20);
        dingus92.draw(g2);
        Window dingus93 = new Window(80,70+y1,20,20);
        dingus93.draw(g2);
        Window dingus94 = new Window(110,70+y1,20,20);
        dingus94.draw(g2);
        Window dingus95 = new Window(140,70+y1,20,20);
        dingus95.draw(g2);
        Window dingus96 = new Window(170,70+y1,20,20);
        dingus96.draw(g2);
        Window dingus97 = new Window(200,70+y1,20,20);
        dingus97.draw(g2);
        y1=y1+30;
        Window dingus102 = new Window(50,70+y1,20,20);
        dingus102.draw(g2);
        Window dingus103 = new Window(80,70+y1,20,20);
        dingus103.draw(g2);
        Window dingus104 = new Window(110,70+y1,20,20);
        dingus104.draw(g2);
        Window dingus105 = new Window(140,70+y1,20,20);
        dingus105.draw(g2);
        Window dingus106 = new Window(170,70+y1,20,20);
        dingus106.draw(g2);
        Window dingus107 = new Window(200,70+y1,20,20);
        dingus107.draw(g2);
        
        
        
        
        
        
        
        
        
        x1=200;
        y1=0;
        Building dingus = new Building(40+x1,60,200,400);
        dingus.draw(g2);
        Window dingus2 = new Window(50+x1,70,20,20);
        dingus2.draw(g2);
        Window dingus3 = new Window(80+x1,70,20,20);
        dingus3.draw(g2);
        Window dingus4 = new Window(110+x1,70,20,20);
        dingus4.draw(g2);
        Window dingus5 = new Window(140,70,20,20);
        dingus5.draw(g2);
        Window dingus6 = new Window(170,70,20,20);
        dingus6.draw(g2);
        Window dingus7 = new Window(200,70,20,20);
        dingus7.draw(g2);
        
        Window dingus8 = new Window(50+x1,100,20,20);
        dingus8.draw(g2);
        Window dingus9 = new Window(80+x1,100,20,20);
        dingus9.draw(g2);
        Window dingus10 = new Window(110+x1,100,20,20);
        dingus10.draw(g2);
        Window dingus11 = new Window(140+x1,100,20,20);
        dingus11.draw(g2);
        Window dingus12 = new Window(170,100,20,20);
        dingus12.draw(g2);
        Window dingus13 = new Window(200,100,20,20);
        dingus13.draw(g2);
        
        Window dingus14 = new Window(50+x1,130,20,20);
        dingus14.draw(g2);
        Window dingus15 = new Window(80+x1,130,20,20);
        dingus15.draw(g2);
        Window dingus16 = new Window(110+x1,130,20,20);
        dingus16.draw(g2);
        Window dingus17 = new Window(140+x1,130,20,20);
        dingus17.draw(g2);
        Window dingus18 = new Window(170,130,20,20);
        dingus18.draw(g2);
        Window dingus19 = new Window(200,130,20,20);
        dingus19.draw(g2);
        
        Window dingus20 = new Window(50+x1,160,20,20);
        dingus20.draw(g2);
        Window dingus21 = new Window(80+x1,160,20,20);
        dingus21.draw(g2);
        Window dingus22 = new Window(110+x1,160,20,20);
        dingus22.draw(g2);
        Window dingus23 = new Window(140+x1,160,20,20);
        dingus23.draw(g2);
        Window dingus24 = new Window(170,160,20,20);
        dingus24.draw(g2);
        Window dingus25 = new Window(200,160,20,20);
        dingus25.draw(g2);
        
        Window dingus26 = new Window(50+x1,160,20,20);
        dingus26.draw(g2);
        Window dingus27 = new Window(80+x1,160,20,20);
        dingus27.draw(g2);
        Window dingus28 = new Window(110+x1,160,20,20);
        dingus28.draw(g2);
        Window dingus29 = new Window(140,160,20,20);
        dingus29.draw(g2);
        Window dingus30 = new Window(170,160,20,20);
        dingus30.draw(g2);
        Window dingus31 = new Window(200,160,20,20);
        dingus31.draw(g2);
        
        Window dingus32 = new Window(50+x1,190,20,20);
        dingus32.draw(g2);
        Window dingus33 = new Window(80+x1,190,20,20);
        dingus33.draw(g2);
        Window dingus34 = new Window(110+x1,190,20,20);
        dingus34.draw(g2);
        Window dingus35 = new Window(140,190,20,20);
        dingus35.draw(g2);
        Window dingus36 = new Window(170,190,20,20);
        dingus36.draw(g2);
        Window dingus37 = new Window(200,190,20,20);
        dingus37.draw(g2);
        
        y1 = 150;
        x1 = 0;
        
        Window dingus42 = new Window(50+x1,70+y1,20,20);
        dingus42.draw(g2);
        Window dingus43 = new Window(80+x1,70+y1,20,20);
        dingus43.draw(g2);
        Window dingus44 = new Window(110+x1,70+y1,20,20);
        dingus44.draw(g2);
        Window dingus45 = new Window(140,70+y1,20,20);
        dingus45.draw(g2);
        Window dingus46 = new Window(170,70+y1,20,20);
        dingus46.draw(g2);
        Window dingus47 = new Window(200,70+y1,20,20);
        dingus47.draw(g2);
        
        y1 = y1+30;
        
        Window dingus52 = new Window(50+x1,70+y1,20,20);
        dingus52.draw(g2);
        Window dingus53 = new Window(80+x1,70+y1,20,20);
        dingus53.draw(g2);
        Window dingus54 = new Window(110+x1,70+y1,20,20);
        dingus54.draw(g2);
        Window dingus55 = new Window(140,70+y1,20,20);
        dingus55.draw(g2);
        Window dingus56 = new Window(170,70+y1,20,20);
        dingus56.draw(g2);
        Window dingus57 = new Window(200,70+y1,20,20);
        dingus57.draw(g2);
        
        y1=y1+30;
        
        Window dingus62 = new Window(50+x1,70+y1,20,20);
        dingus62.draw(g2);
        Window dingus63 = new Window(80+x1,70+y1,20,20);
        dingus63.draw(g2);
        Window dingus64 = new Window(110+x1,70+y1,20,20);
        dingus64.draw(g2);
        Window dingus65 = new Window(140,70+y1,20,20);
        dingus65.draw(g2);
        Window dingus66 = new Window(170,70+y1,20,20);
        dingus66.draw(g2);
        Window dingus67 = new Window(200,70+y1,20,20);
        dingus67.draw(g2);
        
        y1 = y1+30;
        Window dingus72 = new Window(50+x1,70+y1,20,20);
        dingus72.draw(g2);
        Window dingus73 = new Window(80+x1,70+y1,20,20);
        dingus73.draw(g2);
        Window dingus74 = new Window(110+x1,70+y1,20,20);
        dingus74.draw(g2);
        Window dingus75 = new Window(140,70+y1,20,20);
        dingus75.draw(g2);
        Window dingus76 = new Window(170,70+y1,20,20);
        dingus76.draw(g2);
        Window dingus77 = new Window(200,70+y1,20,20);
        dingus77.draw(g2);
        y1=y1+30;
        Window dingus82 = new Window(50+x1,70+y1,20,20);
        dingus82.draw(g2);
        Window dingus83 = new Window(80+x1,70+y1,20,20);
        dingus83.draw(g2);
        Window dingus84 = new Window(110+x1,70+y1,20,20);
        dingus84.draw(g2);
        Window dingus85 = new Window(140,70+y1,20,20);
        dingus85.draw(g2);
        Window dingus86 = new Window(170,70+y1,20,20);
        dingus86.draw(g2);
        Window dingus87 = new Window(200,70+y1,20,20);
        dingus87.draw(g2);
        y1 =y1+30;
        
        Window dingus92 = new Window(50+x1,70+y1,20,20);
        dingus92.draw(g2);
        Window dingus93 = new Window(80+x1,70+y1,20,20);
        dingus93.draw(g2);
        Window dingus94 = new Window(110+x1,70+y1,20,20);
        dingus94.draw(g2);
        Window dingus95 = new Window(140,70+y1,20,20);
        dingus95.draw(g2);
        Window dingus96 = new Window(170,70+y1,20,20);
        dingus96.draw(g2);
        Window dingus97 = new Window(200,70+y1,20,20);
        dingus97.draw(g2);
        y1=y1+30;
        Window dingus102 = new Window(50+x1,70+y1,20,20);
        dingus102.draw(g2);
        Window dingus103 = new Window(80+x1,70+y1,20,20);
        dingus103.draw(g2);
        Window dingus104 = new Window(110+x1,70+y1,20,20);
        dingus104.draw(g2);
        Window dingus105 = new Window(140,70+y1,20,20);
        dingus105.draw(g2);
        Window dingus106 = new Window(170,70+y1,20,20);
        dingus106.draw(g2);
        Window dingus107 = new Window(200,70+y1,20,20);
        dingus107.draw(g2);
        
        
    }

}
