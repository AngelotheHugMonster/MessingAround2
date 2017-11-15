import java.awt.*;

public class MovingThing
{
    double posX, posY;
    double speedX, speedY;
    Color c;
    
    public MovingThing(double posX, double posY)
    {
        this.posX = posX;
        this.posY = posY;
        
        this.speedX = 0.001;
        this.speedY = 0.001;
        this.c = Color.BLACK;
    }
    
    /////////////////
    //Setters
    /////////////////
    public void setColor(Color c)
    {
        this.c = c;
    }
    public void setSpeed(double speedX, double speedY)
    {
        this.speedX = speedX;
        this.speedY = speedY;
    }
    
    /////////////////
    //Utility
    /////////////////
    public void tick()
    {
        posX += speedX;
        posY += speedY;
    }
    public void render(Graphics g)
    {
        g.setColor(c);
        g.fillRect((int) posX, (int) posY, 25, 25);
    }
}
