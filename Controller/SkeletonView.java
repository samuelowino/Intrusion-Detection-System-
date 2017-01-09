/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import SessionCookiesModule.SessionCookieesTab;
import SystemAnomalies.SystemAnomalies;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;
import sessionMonitoringModule.SessionLogs;


    
    
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class SkeletonView extends JFrame {

    private static JLabel productNameLebel;
    private static JList menuItemsList;
    private static JSplitPane splitPane;
    private static JPanel homeRightPanel;
    private static JPanel overRollBodyPanel;
    private static JPanel headerSection;
    private static JLabel headerImageLabel;
    private static JPanel leftMenuButtonsPanel;
    private static JLabel secureConnectionLabel;
    private static JLabel aboutLabel;
    private static JLabel privacyLabel;
    private static JLabel termsLabel;
    private static JLabel jobsLabel;
    private static JLabel developerName;
    private static JButton homeScreenTab;
    private static JButton userTab;
    private static JButton sessionMonitor;
    private static JButton sessionCookies;
    private static JButton systemAnomalies;
    private static JButton medicalStaffTab;
    private static JButton helpTab;
    private static JButton benefitsOptionButton;
    private static JButton nhifTabButton;
    private static JButton settingsOptionsButton;
    private static JButton helpOptionButton;
    private static JLabel currenttimelabel;
    private static JLabel currentDateLabel;
   // private static BufferedImage companyLogoImage;
    private static JButton nssfTabButton;
    private static JButton payeTabButton;
    private static JButton welfareLoanButton;

    private static String[] menuItems = {"Home", "About",
        "Users", "", "Reception", "Lab", "Pharmacy",
        "", "Help", "", "", "", "", ""};

    public SkeletonView() {

        super("BLACK HAT SECURITY");
        
        setSize(1000, 665);
        setLocation(80, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#084061"));
        
        LocalTime now = LocalTime.now();
        String currenttime = now.toString();
        LocalDate today = LocalDate.now();
        String currentdate = today.toString();

        headerImageLabel = new JLabel( new ImageIcon(getClass().getResource("/appimages/images.jpg")));
        headerSection = new JPanel(null);
        headerSection.setBackground(Color.red);
        headerImageLabel.setBounds(0,0,190,170);
        headerSection.setBounds(0,0,190,170);
        headerSection.add(headerImageLabel);
        developerName = new JLabel("");
        welfareLoanButton = new JButton("");
        nssfTabButton = new JButton("");
        payeTabButton = new JButton("");

        currentDateLabel = new JLabel(currentdate + " ,");
        currenttimelabel = new JLabel(currenttime);
        currentDateLabel.setFont(new Font("calibri", Font.BOLD, 16));
        currenttimelabel.setFont(new Font("calibri", Font.PLAIN, 14));
        currenttimelabel.setForeground(Color.BLUE);
        currentDateLabel.setForeground(Color.DARK_GRAY);
        currentDateLabel.setBounds(940, 702, 90, 20);
        currenttimelabel.setBounds(1030, 702, 100, 20);

        homeScreenTab = new JButton("Home");
        userTab = new JButton("Users");
        sessionMonitor = new JButton("Session Monitor");
        sessionCookies = new JButton("Session Cookies");
        systemAnomalies = new JButton("System Anomalies");
        medicalStaffTab = new JButton("Medical Staff");
        helpTab = new JButton("Help");
        benefitsOptionButton = new JButton("");
        nhifTabButton = new JButton(" ");
        settingsOptionsButton = new JButton("");
        helpOptionButton = new JButton("");
        menuItemsList = new JList(menuItems);
        splitPane = new JSplitPane();
        homeRightPanel = new JPanel();
        overRollBodyPanel = new JPanel();
        leftMenuButtonsPanel = new JPanel(null);
        productNameLebel = new JLabel("");
        secureConnectionLabel = new JLabel("Secure Connection");
        aboutLabel = new JLabel("about");
        privacyLabel = new JLabel("privacy");
        termsLabel = new JLabel("terms");
        jobsLabel = new JLabel("jobs");

//        companyLogoImage = settupBufferedImage(productNameLebel, "wewasafo.png");

        secureConnectionLabel.setBounds(180, 702, 110, 25);
        aboutLabel.setBounds(320, 702, 50, 25);
        privacyLabel.setBounds(390, 702, 50, 25);
        termsLabel.setBounds(460, 702, 50, 25);
        jobsLabel.setBounds(530, 702, 50, 25);
        developerName.setBounds(590, 702, 250, 25);

        List<JButton> optionButtons = Arrays.asList(
                homeScreenTab, userTab, sessionMonitor,
                sessionCookies, systemAnomalies,helpTab, 
                benefitsOptionButton, nhifTabButton, settingsOptionsButton,
                helpOptionButton,welfareLoanButton,payeTabButton,nssfTabButton
        );

        setMenuButtonsProperties(optionButtons);

        List<JComponent> components = Arrays.asList(
                secureConnectionLabel, aboutLabel, termsLabel, privacyLabel, jobsLabel,developerName
        );

        setGreyForegrounds(components);

        overRollBodyPanel.setBounds(0, 30, 1180, 650);
        overRollBodyPanel.setBackground(Color.red);
        overRollBodyPanel.setLayout(null);

        productNameLebel.setForeground(Color.red);
        productNameLebel.setFont(new Font("Calibri Light", Font.BOLD, 22));
        // productNameLebel.setIcon(new ImageIcon(getClass().getResource("appimage/alphaIcon.PNG")));
        productNameLebel.setBounds(5, 5, 300, 100);
        homeScreenTab.setBounds(10, 175, 80, 30);
        userTab.setBounds(9, 200, 85, 30);
        sessionMonitor.setBounds(10, 230, 130, 30);
        sessionCookies.setBounds(10, 255, 130, 30);
        systemAnomalies.setBounds(13, 280, 140, 30);
        medicalStaffTab.setBounds(10, 305, 130, 30);
        helpTab.setBounds(10, 345, 90, 25);
        benefitsOptionButton.setBounds(10, 315, 65, 25);
        nhifTabButton.setBounds(10, 360, 100, 25);
        nssfTabButton.setBounds(10,385,40,25);
        payeTabButton.setBounds(10,410,40,25);
        welfareLoanButton.setBounds(10,435,105,25);
        settingsOptionsButton.setBounds(10, 485, 65, 25);
        helpOptionButton.setBounds(10, 530, 40, 25);

        homeRightPanel.setBackground(Color.WHITE);
        homeRightPanel.setBorder(new LineBorder(Color.decode("#A9A9A9"), 1));
        leftMenuButtonsPanel.setBackground(Color.decode("#084061"));

        menuItemsList.setFixedCellWidth(250);
        menuItemsList.setFixedCellHeight(30);
        menuItemsList.setBounds(10, 80, 150, 599);
        menuItemsList.setForeground(Color.BLACK);
        menuItemsList.setBackground(Color.decode("#084061"));
        menuItemsList.setFont(new Font("Calibri", Font.BOLD, 12));
        leftMenuButtonsPanel.add(productNameLebel);

        splitPane.setDividerLocation(190);
        splitPane.setDividerSize(1);
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setBounds(0, 0, 1195, 700);
        splitPane.setEnabled(false);

//        splitPane.setRightComponent(new DashBoard(getLoggedInUser()));
        splitPane.setLeftComponent(leftMenuButtonsPanel);
        splitPane.setRightComponent( new HomeScreen());

        overRollBodyPanel.add(splitPane);

        homeScreenTab.addActionListener(e -> replaceRightPanel( new HomeScreen()));
        sessionMonitor.addActionListener(e -> {replaceRightPanel(new SessionLogs());});
        sessionCookies.addActionListener(e -> {replaceRightPanel(new SessionCookieesTab());});
        systemAnomalies.addActionListener(e -> replaceRightPanel( new SystemAnomalies()));
        
        /**
        patientstab.addActionListener(e -> replaceRightPanel(new PatientManagementtabs()));
        userTab.addActionListener(e -> replaceRightPanel(new UserManagementTabs()));
        laboratoryTab.addActionListener(e -> replaceRightPanel(new LabManagementTabs()));
        receptionTab.addActionListener(e -> replaceRightPanel(new ReceptionManagementTab()));
        homeScreenTab.addActionListener(e -> replaceRightPanel(new HomeScreen()));
        medicalStaffTab.addActionListener(e -> replaceRightPanel(new MedicalStaffManagementTab()));
        //Panel views switching mechanism
        /* dashBoardOPtionButton.addActionListener(e -> replaceRightPanel(new DashBoard("")));
        
        runPayrollButton.addActionListener(e -> replaceRightPanel(new RunPayRoll()));
        employeesOptionButton.addActionListener(e -> replaceRightPanel(new Employees()));
        addContributorsOptionButtons.addActionListener(e -> replaceRightPanel(new Contributors()));
        settingsOptionsButton.addActionListener(e -> replaceRightPanel(new CompanySettings()));
        payrollHistoryButton.addActionListener(e -> replaceRightPanel(new PayrollHistory()));
        benefitsOptionButton.addActionListener(e -> replaceRightPanel(new CompanyBenefits()));
        payrollAnalysis.addActionListener(e -> replaceRightPanel(new CompanySnapshot()));
        nhifTabButton.addActionListener(e -> replaceRightPanel(new NHIFReports()));
        nssfTabButton.addActionListener( e -> replaceRightPanel( new nssfReportsView()));
        welfareLoanButton.addActionListener( e -> replaceRightPanel( new welfareLoanReportsView()));
        payeTabButton.addActionListener( e -> replaceRightPanel(new PAYEReportsView()));*/
        helpOptionButton.addActionListener(e -> {
            //  waitDialog.setVisible(true);

            try {

                setCursor(new Cursor(Cursor.WAIT_CURSOR));
                Thread.sleep(10000);
                Desktop.getDesktop().browse(new URI(getClass().getResource("ExternalHelpPages/ReleaseNotes.html").toString()));

            } catch (IOException | URISyntaxException ex) {

//                Logger.getLogger(PayrollSystem.class.getName()).log(Level.SEVERE, null, ex);

            } catch (InterruptedException ex) {
            }

            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        });
        
        leftMenuButtonsPanel.add(headerSection);

        add(overRollBodyPanel);
        add(secureConnectionLabel);
        add(aboutLabel);
        add(privacyLabel);
        add(termsLabel);
        add(jobsLabel);
        add(developerName);
        add(currentDateLabel);
        add(currenttimelabel);

        repaint();
        setVisible(true);

    }
    
    /**
     *Obtain the user who is logged in...
     * @return
     */
    public final String getLoggedInUser() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollSystem","root","")) {
            String loggedInUser = "";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT userEmail FROM  loggedInUser;");
            while(resultSet.next()){
                loggedInUser = resultSet.getString("userEmail");
            }
            return loggedInUser;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to add user...", ""
                    + "Alpha Payroll System", JOptionPane.ERROR_MESSAGE);
            return "User";
        }
        
    }


    /**
     *Logs out the current user...
     */
    public final void clearLoggedInUser() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://"
                + "localhost:3306/payrollSystem","root","")) {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM loggedInUser;");
            JOptionPane.showMessageDialog(this, "User Logged out succefully!",
                    "Wesafo payroll System",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Unable to log out current user...");
        }
    }

    /**
     * Creates a buffered image from the specified file
     *
     * @param fileName
     * @return BufferedImage object representing the specified image
     */
    public final BufferedImage settupBufferedImage(JLabel label, String fileName) {
        try {
            BufferedImage requiredImage = null;
            requiredImage = ImageIO.read(getClass().getResource("/appimage/" + fileName));
            label.setIcon(new ImageIcon(requiredImage));
            return requiredImage;

        } catch (NullPointerException e) {
            label = new JLabel();
            return null;
        } catch (IOException e) {
            label = new JLabel();
            JOptionPane.showMessageDialog(null, "Could not load required Image...\n" + e.getMessage(), "Windows AppCat", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static final void replaceRightPanel(JPanel nextPanel) {

        splitPane.remove(splitPane.getRightComponent());
        splitPane.setRightComponent(nextPanel);
        splitPane.setDividerLocation(190);
        splitPane.setDividerSize(1);
    }

    private static void setGreyForegrounds(List<JComponent> components) {
        components.stream()
                .forEach(e -> e.setForeground(Color.decode("#696969")));

    }

    protected final void setMenuButtonsProperties(List<JButton> sideMenuButtons) {
        sideMenuButtons.stream()
                .forEach(e -> {
                    e.setFont(new Font("Calibri Light", Font.BOLD, 16));
                    e.setBorder(new LineBorder(Color.decode("#084061")));
                    e.setBackground(Color.decode("#084061"));
                    e.setForeground(Color.decode("#000000"));
                    e.addMouseListener(
                            new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent event) {
                            e.setForeground(Color.red);
                            setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }

                        @Override
                        public void mouseExited(MouseEvent event) {
                            e.setForeground(Color.decode("#000000"));
                            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                        }
                    }
                    );
                    leftMenuButtonsPanel.add(e);
                });
    }
}
