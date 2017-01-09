/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionCookiesModule;

import SystemAnomalies.BouncedLogInAttempts;
import SystemAnomalies.bouncedLogInRate;
import Controller.HomeScreen;
import Controller.SkeletonView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import sessionMonitoringModule.SessionDurationDetails;

public class SessionCookieesTab extends JPanel {

    private static JButton jumpToHome;
    private static JLabel jumpToHomeMessage;
    private static JTabbedPane tabbedPane;
    private static JLabel helpLabel;
    private static JLabel settingsLabel;
    private static JLabel settingsMessage;
    private static JLabel helpMessage;

    public SessionCookieesTab() {
        
        setSize(750, 700);
        setLocation(0, 0);
        setBackground(Color.decode("#084061"));
        setLayout(null);

        jumpToHomeMessage = new JLabel("Jump To Home");
        jumpToHome = new JButton(new ImageIcon(getClass()
                .getResource("/appimages/ic_action_home.png")));
        settingsMessage = new JLabel("Settings");
        settingsLabel = new JLabel( new ImageIcon(getClass()
                .getResource("/appimages/ic_action_settings.png")));
        helpMessage = new JLabel("Help");
        helpLabel = new JLabel( new ImageIcon(getClass()
                .getResource("/appimages/ic_action_cv.png")));
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 30, 750, 500);
        tabbedPane.setForeground(Color.white);
        tabbedPane.setBackground(Color.decode("#8d0628"));
        helpLabel.setBounds(650,530,65,65);
        settingsMessage.setBounds(600,550,90,30);
        settingsLabel.setBounds(540,530,65,65);
        jumpToHomeMessage.setBounds(440,530,140,65);
        jumpToHome.setBounds(370,530,60,65);
        helpMessage.setBounds(705,550,100,30);
        jumpToHomeMessage.setForeground(Color.WHITE);
        helpMessage.setForeground(Color.WHITE);
        settingsMessage.setForeground(Color.WHITE);
        jumpToHome.setBackground(Color.decode("#084061"));
        jumpToHome.setBorder( new LineBorder(Color.decode("#084061")));
        jumpToHomeMessage.setFont( new Font("Calibri bold",Font.BOLD,16));
        settingsMessage.setFont( new Font("Calibri Bold",Font.BOLD,16));
        helpMessage.setFont( new Font("Calibri bold",Font.BOLD,16));

        tabbedPane.add("Bounced Log in Attempts", new BouncedLogInAttempts());
        tabbedPane.add("Bounced Log in rate", new bouncedLogInRate());
        tabbedPane.add("Time of Day", new SessionDurationDetails());
        jumpToHome.addActionListener( e -> {SkeletonView.replaceRightPanel( new HomeScreen());});

        add(tabbedPane);
        add(helpLabel);
        add(helpMessage);
        add(settingsLabel);
        add(settingsMessage);
        add(jumpToHome);
        add(jumpToHomeMessage);
    }
}

