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
        Background background = new Background(0,0,8000,8000);
        background.draw(g2);
        Sun sun = new Sun(0,0,120,120);
        sun.draw(g2);
        Ground ground = new Ground(0,350,5000,5000);
        ground.draw(g2);
        
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
        
        
        
        
        
        
        
        
        
        x1=210;
        y1=0;
        Building dingo = new Building(40+x1,60,200,400);
        dingo.draw(g2);
        Window dingo2 = new Window(50+x1,70,20,20);
        dingo2.draw(g2);
        Window dingo3 = new Window(80+x1,70,20,20);
        dingo3.draw(g2);
        Window dingo4 = new Window(110+x1,70,20,20);
        dingo4.draw(g2);
        Window dingo5 = new Window(140+x1,70,20,20);
        dingo5.draw(g2);
        Window dingo6 = new Window(170+x1,70,20,20);
        dingo6.draw(g2);
        Window dingo7 = new Window(200+x1,70,20,20);
        dingo7.draw(g2);
        
        Window dingo8 = new Window(50+x1,100,20,20);
        dingo8.draw(g2);
        Window dingo9 = new Window(80+x1,100,20,20);
        dingo9.draw(g2);
        Window dingo10 = new Window(110+x1,100,20,20);
        dingo10.draw(g2);
        Window dingo11 = new Window(140+x1,100,20,20);
        dingo11.draw(g2);
        Window dingo12 = new Window(170+x1,100,20,20);
        dingo12.draw(g2);
        Window dingo13 = new Window(200+x1,100,20,20);
        dingo13.draw(g2);
        
        Window dingo14 = new Window(50+x1,130,20,20);
        dingo14.draw(g2);
        Window dingo15 = new Window(80+x1,130,20,20);
        dingo15.draw(g2);
        Window dingo16 = new Window(110+x1,130,20,20);
        dingo16.draw(g2);
        Window dingo17 = new Window(140+x1,130,20,20);
        dingo17.draw(g2);
        Window dingo18 = new Window(170+x1,130,20,20);
        dingo18.draw(g2);
        Window dingo19 = new Window(200+x1,130,20,20);
        dingo19.draw(g2);
        
        Window dingo20 = new Window(50+x1,160,20,20);
        dingo20.draw(g2);
        Window dingo21 = new Window(80+x1,160,20,20);
        dingo21.draw(g2);
        Window dingo22 = new Window(110+x1,160,20,20);
        dingo22.draw(g2);
        Window dingo23 = new Window(140+x1,160,20,20);
        dingo23.draw(g2);
        Window dingo24 = new Window(170+x1,160,20,20);
        dingo24.draw(g2);
        Window dingo25 = new Window(200+x1,160,20,20);
        dingo25.draw(g2);
        
        Window dingo26 = new Window(50+x1,160,20,20);
        dingo26.draw(g2);
        Window dingo27 = new Window(80+x1,160,20,20);
        dingo27.draw(g2);
        Window dingo28 = new Window(110+x1,160,20,20);
        dingo28.draw(g2);
        Window dingo29 = new Window(140+x1,160,20,20);
        dingo29.draw(g2);
        Window dingo30 = new Window(170+x1,160,20,20);
        dingo30.draw(g2);
        Window dingo31 = new Window(200+x1,160,20,20);
        dingo31.draw(g2);
        
        Window dingo32 = new Window(50+x1,190,20,20);
        dingo32.draw(g2);
        Window dingo33 = new Window(80+x1,190,20,20);
        dingo33.draw(g2);
        Window dingo34 = new Window(110+x1,190,20,20);
        dingo34.draw(g2);
        Window dingo35 = new Window(140+x1,190,20,20);
        dingo35.draw(g2);
        Window dingo36 = new Window(170+x1,190,20,20);
        dingo36.draw(g2);
        Window dingo37 = new Window(200+x1,190,20,20);
        dingo37.draw(g2);
        
        y1 = 150;
        
        Window dingo42 = new Window(50+x1,70+y1,20,20);
        dingo42.draw(g2);
        Window dingo43 = new Window(80+x1,70+y1,20,20);
        dingo43.draw(g2);
        Window dingo44 = new Window(110+x1,70+y1,20,20);
        dingo44.draw(g2);
        Window dingo45 = new Window(140+x1,70+y1,20,20);
        dingo45.draw(g2);
        Window dingo46 = new Window(170+x1,70+y1,20,20);
        dingo46.draw(g2);
        Window dingo47 = new Window(200+x1,70+y1,20,20);
        dingo47.draw(g2);
        
        y1 = y1+30;
        
        Window dingo52 = new Window(50+x1,70+y1,20,20);
        dingo52.draw(g2);
        Window dingo53 = new Window(80+x1,70+y1,20,20);
        dingo53.draw(g2);
        Window dingo54 = new Window(110+x1,70+y1,20,20);
        dingo54.draw(g2);
        Window dingo55 = new Window(140+x1,70+y1,20,20);
        dingo55.draw(g2);
        Window dingo56 = new Window(170+x1,70+y1,20,20);
        dingo56.draw(g2);
        Window dingo57 = new Window(200+x1,70+y1,20,20);
        dingo57.draw(g2);
        
        y1=y1+30;
        
        Window dingo62 = new Window(50+x1,70+y1,20,20);
        dingo62.draw(g2);
        Window dingo63 = new Window(80+x1,70+y1,20,20);
        dingo63.draw(g2);
        Window dingo64 = new Window(110+x1,70+y1,20,20);
        dingo64.draw(g2);
        Window dingo65 = new Window(140+x1,70+y1,20,20);
        dingo65.draw(g2);
        Window dingo66 = new Window(170+x1,70+y1,20,20);
        dingo66.draw(g2);
        Window dingo67 = new Window(200+x1,70+y1,20,20);
        dingo67.draw(g2);
        
        y1 = y1+30;
        Window dingo72 = new Window(50+x1,70+y1,20,20);
        dingo72.draw(g2);
        Window dingo73 = new Window(80+x1,70+y1,20,20);
        dingo73.draw(g2);
        Window dingo74 = new Window(110+x1,70+y1,20,20);
        dingo74.draw(g2);
        Window dingo75 = new Window(140+x1,70+y1,20,20);
        dingo75.draw(g2);
        Window dingo76 = new Window(170+x1,70+y1,20,20);
        dingo76.draw(g2);
        Window dingo77 = new Window(200+x1,70+y1,20,20);
        dingo77.draw(g2);
        y1=y1+30;
        Window dingo82 = new Window(50+x1,70+y1,20,20);
        dingo82.draw(g2);
        Window dingo83 = new Window(80+x1,70+y1,20,20);
        dingo83.draw(g2);
        Window dingo84 = new Window(110+x1,70+y1,20,20);
        dingo84.draw(g2);
        Window dingo85 = new Window(140+x1,70+y1,20,20);
        dingo85.draw(g2);
        Window dingo86 = new Window(170+x1,70+y1,20,20);
        dingo86.draw(g2);
        Window dingo87 = new Window(200+x1,70+y1,20,20);
        dingo87.draw(g2);
        y1 =y1+30;
        
        Window dingo92 = new Window(50+x1,70+y1,20,20);
        dingo92.draw(g2);
        Window dingo93 = new Window(80+x1,70+y1,20,20);
        dingo93.draw(g2);
        Window dingo94 = new Window(110+x1,70+y1,20,20);
        dingo94.draw(g2);
        Window dingo95 = new Window(140+x1,70+y1,20,20);
        dingo95.draw(g2);
        Window dingo96 = new Window(170+x1,70+y1,20,20);
        dingo96.draw(g2);
        Window dingo97 = new Window(200+x1,70+y1,20,20);
        dingo97.draw(g2);
        y1=y1+30;
        Window dingo102 = new Window(50+x1,70+y1,20,20);
        dingo102.draw(g2);
        Window dingo103 = new Window(80+x1,70+y1,20,20);
        dingo103.draw(g2);
        Window dingo104 = new Window(110+x1,70+y1,20,20);
        dingo104.draw(g2);
        Window dingo105 = new Window(140+x1,70+y1,20,20);
        dingo105.draw(g2);
        Window dingo106 = new Window(170+x1,70+y1,20,20);
        dingo106.draw(g2);
        Window dingo107 = new Window(200+x1,70+y1,20,20);
        dingo107.draw(g2);
        
        
        
        
        
    }

}
