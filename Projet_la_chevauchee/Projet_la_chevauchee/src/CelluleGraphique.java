/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alban
 */
import javax.swing.*;
import java.awt.*;

public class CelluleGraphique extends JButton {
    private int etat;
    private boolean estCavalier;
    private boolean estClaire;
    
    public CelluleGraphique() {
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        }
    public void maj(int etat, boolean cavalierIci, boolean couleurClaire) {
        this.etat = etat;
        this.estCavalier = cavalierIci;
        this.estClaire = couleurClaire;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (estClaire) {
            g.setColor(new Color(255, 180, 220)); 
        } else {
            g.setColor(new Color(205, 20, 147)); 
        }
        g.fillRect(0, 0, getWidth(), getHeight());

        if (etat == 1) {
            g.setColor(new Color(255, 179, 71)); 
            g.fillOval(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2);
        }

        if (estCavalier) {
            g.setColor(new Color(250, 230, 50)); 
            g.setFont(new Font("Serif", Font.BOLD, 50));
            g.drawString("\u265E", getWidth()/4, (int)(getHeight()/1.3));
        }
        
        g.setColor(new Color(200, 0, 150)); 
        g.drawRect(0, 0, getWidth(), getHeight());
    }
}
