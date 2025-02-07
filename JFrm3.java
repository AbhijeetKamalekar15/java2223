import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class MyPanel extends JPanel  {
    int x,y;
    MyPanel()
    {
        super();
        setBorder(BorderFactory.createLineBorder(Color.red,5));
        addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
       
    }
    protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawRect(x,y,20,20);
        }
    
}
class JFrm3 extends JFrame{
    MyPanel pan;
    JFrm3()
    {
        super();
        pan=new MyPanel();
        add(pan);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrm3 a=new JFrm3();
    }
}