/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAnomalies;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HACKER
 */
public class BouncedLogInAttempts extends JPanel {

 
    private static JLabel blockedLabel;
    private static JLabel refreshLabel;
    private static JLabel nameLabel;
    private static JTable table;
    private static JTable newTable;
    private static JScrollPane scrollPane;

    public BouncedLogInAttempts() {
        setSize(700, 700);
        setLocation(0, 0);
        setBackground(Color.decode("#084061"));
        setLayout(null);

        
        refreshLabel = new JLabel(new ImageIcon(getClass().getResource("/appimages/ic_action_side.png")));
        scrollPane = new JScrollPane();
        nameLabel = new JLabel("Blocked Attemps");
        blockedLabel = new JLabel(new ImageIcon(getClass().getResource("/appimages/ic_action_name.png")));
        blockedLabel.setBounds(2, 2, 65, 65);
        nameLabel.setForeground(Color.white);
        nameLabel.setFont(new Font("Calibri Bold", Font.BOLD, 16));
        nameLabel.setBounds(70, 20, 150, 30);
        refreshLabel.setBounds(680,10,64,64);
        scrollPane.getViewport().setBackground(Color.decode("#084061"));
        scrollPane.setBounds(0, 75, 749, 700);
        

        scrollPane.getViewport().add(createView());

        add(blockedLabel);
        add(nameLabel);
        add(scrollPane);
        add(refreshLabel);
        

    }

    public static DefaultTableModel buildtableModel(ResultSet resultSet) throws SQLException {

        ResultSetMetaData metaData = resultSet.getMetaData();

        Vector<String> columnNames = new Vector<>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));

        }

        Vector<Vector<Object>> data = new Vector<>();
        while (resultSet.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(resultSet.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }

    private static JTable createView() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ids", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM bounced_log_in_attemps");

            table = new JTable(buildtableModel(resultSet));
            UIDefaults defaults = UIManager.getLookAndFeelDefaults();
            defaults.put("Table.alternateRowColor", Color.decode("#f5f5f5"));
            table.setSelectionBackground(Color.decode("#1e90ff"));
            table.setSelectionForeground(Color.decode("#084061"));
            table.setRowHeight(30);
            table.setForeground(Color.WHITE);
            table.setBackground(Color.decode("#084061"));
            table.setShowGrid(false);
            table.setFont(new Font("calibri", Font.PLAIN, 16));
            resultSet.close();
            newTable = table;

        } catch (SQLException | HeadlessException exc) {
            JOptionPane.showMessageDialog(null, exc);
        }
        return newTable;
    }

}
