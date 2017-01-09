/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HACKER
 */
public class HomeScreen extends JPanel {
    
    private static JLabel backgroundImageLabel;
    private static BufferedImage image;
    private static JLabel productNameLabel;
    private static JLabel upperSectionLabel;
    private static JButton quickStartButton;
    private static JLabel homeLabel;
    
    public HomeScreen(){
        setSize(700, 700);
        setLocation(0, 0);
        setBackground(Color.decode("#084061"));
        setLayout(null);
        
        homeLabel = new JLabel( new ImageIcon(getClass().getResource("/appimages/ic_action_home.png")));
        quickStartButton = new JButton("QUCIK START");
        image = getBufferedImage("/appimages/logo1.png");
        backgroundImageLabel = new JLabel( new ImageIcon(image));
        backgroundImageLabel.setBounds(0,0,800,800);
        upperSectionLabel = new JLabel("BLACK HAT");
        upperSectionLabel.setBounds(230,150,800,30);
        upperSectionLabel.setForeground(Color.white);
        upperSectionLabel.setFont( new Font("Calibri",Font.BOLD,36));
        productNameLabel = new JLabel("INTRUSION D3TECTION SYSTEM");
        homeLabel.setBounds(500,200,100,50);
        productNameLabel.setBounds(80,250,800,30);
        productNameLabel.setFont( new Font("Calibri",Font.BOLD,36));
        productNameLabel.setForeground(Color.WHITE);
        quickStartButton.setForeground(Color.WHITE);
        quickStartButton.setBackground(Color.decode("#084061"));
        quickStartButton.setBounds(250,330,150,30);
     
        
        add(homeLabel);
        add(productNameLabel);
        add(upperSectionLabel);
        add(quickStartButton);
        add(backgroundImageLabel);
        
        repaint();
    }
    
    public final BufferedImage getBufferedImage(String imageUrl){
        try{
            BufferedImage bufferedImage = null;
            bufferedImage = ImageIO.read(getClass().getResource(imageUrl));
            return bufferedImage;
        
        }catch(IOException ex){
            ex.printStackTrace();
            return new BufferedImage(0,0,0);
        }
    }
    
}
