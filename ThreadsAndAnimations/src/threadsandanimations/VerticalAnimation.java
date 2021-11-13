/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsandanimations;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class VerticalAnimation extends JPanel implements Runnable {
    Image[] creatureImg = new Image[4];
    Thread runner;
    
    int x = 0;
    int y;
    int pic;
    
    public VerticalAnimation() {
        super();
        this.setBackground(Color.WHITE);
        String[] imgs = new String[] {
            "Coolest-Dinosaur.jpg",
            "Jurassic.jfif",
            "Legendary-Dinosaur.jpg",
            "Tyrannosaurus-Rex-Struthiomimus-dinosaurs.jpg"
        };
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        for(int i = 0; i < creatureImg.length; i++) {
            creatureImg[i] = toolkit.getImage(imgs[i]);
        }
        
        if(runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }
    
    @Override
    public void run() {
        while(runner == Thread.currentThread()) {
            y -= 4;
            pic++;
            
            if(pic == 4) {
                pic = 0;
            }
            
            if(y < -4 ) {
                y = (this.getSize().height - 40);
            }
            
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                
            }
            repaint();
        }
    }
    
    @Override
    public void paintComponent(Graphics screen) {
       Graphics2D screen2D = (Graphics2D) screen;
       screen2D.setColor(new Color(255, 0, 15));
       screen2D.fillRect(0, 0, getSize().width, getSize().height);
       screen2D.drawImage(creatureImg[pic], x, y, this);
   }
}
