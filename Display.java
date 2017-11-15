import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame
{
    JFrame f;
    JPanel jp;
    
    public Display()
    {
        f = new JFrame();
        
        f.setTitle("Test");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jp = new GPanel();
        f.add(jp);
        f.setVisible(true);
        f.pack();
    }
    
    
    /////////////////////////
    public JPanel getJP()
    {
        return this.jp;
    }
    public void clear()
    {
        jp.getGraphics().setColor(Color.BLACK);
        jp.getGraphics().clearRect(0, 0, 300, 300);
    }
    /////////////////////////
    
    class GPanel extends JPanel 
    {
        public GPanel()
        {
            f.setPreferredSize(new Dimension(300,300));
        }
        
        @Override
        public void paintComponent(Graphics g)
        {
            g.drawRect(25, 25, 250, 250);
        }
    }
}