/**
* When the application starts, the images are loaded into an array,
* the thread is started and the index of the picture array is incremented
* (along with the x coordinate) every 200 milliseconds.
* The paintComponent() is called by the repaint() method and this draws
* the specific image at the specific coordinates.
*/
package threadsandanimations;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class AnimationPanel extends JPanel implements Runnable{
    Image[] creatureImg = new Image[4];
    Thread runner;
    
    int x;
    int y = 0;
    int pic;
    
    public AnimationPanel() {
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
            x += 4;
            pic++;
            
            if(pic == 4) {
                pic = 0;
            }
            
            if(x > (this.getSize().width - 40)) {
                x = -40;
            }
            
            try {
                Thread.sleep(300);
            } catch(InterruptedException e) {
                
            }
            repaint();
        }
    }
    
    @Override
    public void paintComponent(Graphics screen) {
       Graphics2D screen2D = (Graphics2D) screen;
       screen2D.setColor(Color.white);
       screen2D.fillRect(0, 0, getSize().width, getSize().height);
       screen2D.drawImage(creatureImg[pic], x, y, this);
   }
    
}
