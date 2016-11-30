/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.swingmakeover.chap3;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author fauzi
 */
public class iconTrans extends JPanel{
    private Image ikon;
    
    public iconTrans(){
        setOpaque(false);
        ikon=new ImageIcon(getClass().getClassLoader().getResource("icon.png")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gambar=(Graphics2D)g.create();
        gambar.setComposite(AlphaComposite.SrcOver.derive(0.5F));
        gambar.drawImage(ikon, 0, 0, null);
    }
    
}
