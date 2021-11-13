/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsandanimations;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class VerticalAnimeFrame extends javax.swing.JFrame{
    public VerticalAnimeFrame() {
        super("Animations");
        this.setBounds(200, 200, 400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        VerticalAnimation va = new VerticalAnimation();
        this.add(va);
        this.setVisible(true);
    }
}
