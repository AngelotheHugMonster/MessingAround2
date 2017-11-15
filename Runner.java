import java.awt.*;

/**
 * Me f-ing around
 *
 * @author Angelo Arriaga
 * @version v0.0
 */
public class Runner
{
    public static Graphics g;
    public static MovingThing mt, mt2, mt3;
    
    public static void main(String args[])
    {
        Display d = new Display();
        d.setVisible(true);
        
        g = d.getJP().getGraphics();
        
        mt = new MovingThing(0, 0);
        mt.setColor(Color.RED);
        //
        mt2 = new MovingThing(0, 50);
        mt2.setColor(Color.BLUE);
        mt2.setSpeed(0.0006, 0.0003);
        //
        mt3 = new MovingThing(0, 200);
        mt3.setColor(Color.YELLOW);
        mt3.setSpeed(0.0004, -0.0007);
        while(true)
        {
            d.clear();
            
            mt.tick();
            mt2.tick();
            mt3.tick();
            mt.render(g);
            mt2.render(g);
            mt3.render(g);
        }
    }
}
