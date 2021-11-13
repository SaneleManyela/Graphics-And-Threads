/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsandanimations;

import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class ThreadsAndAnimations extends JFrame{
    public ThreadsAndAnimations() {
        super("Animations");
        this.setBounds(800, 200, 400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        AnimationPanel ap = new AnimationPanel();
        this.add(ap);
        this.setVisible(true);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadsAndAnimations animations = new ThreadsAndAnimations();
        VerticalAnimeFrame va = new VerticalAnimeFrame();        
    }
    
}
