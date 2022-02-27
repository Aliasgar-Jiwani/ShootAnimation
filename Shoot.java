
package gui_project;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Shoot extends Frame implements KeyListener{
    int  x=650,y=50;
    int  x1=79,y1=200;
    int  x2=75,y2=239;
    int x3=125,y3=249;
    int x4=79,y4=290;
    int x5=110,y5=290;
    int x6=125,y6=249;
    public static void main(String[] args) {
        Shoot s=new Shoot();
        
    }
    
    public Shoot()
    {
         this.setSize(700,500);
         this.setVisible(true);
         this.setResizable(false);
         this.addKeyListener(this);
    }
    
    public void paint(Graphics g)
    {
    
        g.fillOval(x1, y1, 40, 40);
        g.fillRect(x2, y2, 50, 70);
        
        g.setColor(Color.red);
        g.fillRect(x3, y3, 20, 40);
        g.setColor(Color.BLACK);
        g.fillRect(x4, y4, 10, 70);
        g.fillRect(x5, y5, 10, 70);
       
        for (int y = 50; y<450; y++) {
            
       try {
         
                 Thread.sleep(7);
                 g.setColor(Color.BLUE);
                 g.fillOval(x, y, 30,30);
               
              
            } catch (InterruptedException ex) {
                System.out.println("e");
            }
       
       
     }
        for (x6 = 125; x6 <617;x6 ++) {
          try
          {
              Thread.sleep(7);
               g.setColor(Color.BLACK);
               g.fillOval(x6, y6, 40, 40);
               Thread.sleep(7);
                g.setColor(Color.WHITE);
               g.fillOval(x6, y6, 40, 40);
              
          }catch (InterruptedException ex) {
                System.out.println("e");
            }
               
           }
        
      }
       
       

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
         if(e.getKeyCode()==KeyEvent.VK_RIGHT)
         {
             x1++;
             x2++;
             x4++;
             x5++;
             repaint();
         }
   
    }
    

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
