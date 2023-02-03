/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MANISH DAS
 */
public class splash extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public splash() {
        initComponents();
        try {
            CreateDb();
            AgentDB();
            CompanyDB();
        } catch (SQLException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void CreateDb() throws SQLException {
        String dbURL = "jdbc:derby:C://PharmacyDB;create=true";
        String user = "admin123";
        String password = "admin123";
        Connection conn = DriverManager.getConnection(dbURL, user, password);
        try {

            String MedicineQuery = "CREATE TABLE MedicineTB( "
                    + "MEDID INT , "
                    + "MEDNAME VARCHAR(255), "
                    + "MEDPRICE INT , "
                    + "MEDQTY INT, "
                    + "MEDFAB DATE,"
                    + "MEDEXP DATE,"
                    + "MEDCOMP VARCHAR(100),"
                    + "PRIMARY KEY(MEDID))";

            Statement stmt = conn.createStatement();

            stmt.execute(MedicineQuery);
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AgentDB() throws SQLException {
        String dbURL = "jdbc:derby:C://PharmacyDB";
        String user = "admin123";
        String password = "admin123";
        Connection conn = DriverManager.getConnection(dbURL, user, password);
        try {

            String AgentQuery = "CREATE TABLE AgentTB( "
                    + "AID INT , "
                    + "ANAME VARCHAR(255), "
                    + "AAGE INT , "
                    + "APHONE VARCHAR(255), "
                    + "APASS VARCHAR(20),"
                    + "AGENDER VARCHAR(10),"
                    + "PRIMARY KEY(AID))";

            Statement agent = conn.createStatement();
            agent.execute(AgentQuery);

            String Admin = "INSERT INTO AgentTB (AID,ANAME,AAGE,APHONE,APASS,AGENDER) VALUES (0,'admin',0,'-','admin','male')";
            Statement admin = conn.createStatement();
            admin.execute(Admin);
        } catch (SQLException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void CompanyDB() throws SQLException {
        String dbURL = "jdbc:derby:C://PharmacyDB";
        String user = "admin123";
        String password = "admin123";
        Connection conn = DriverManager.getConnection(dbURL, user, password);
        try {

            String CompanyQuery = "CREATE TABLE CompanyTB( "
                    + "COMPID INT , "
                    + "COMPNAME VARCHAR(255), "
                    + "COMPAD VARCHAR(200) , "
                    + "COMPEXP INT, "
                    + "COMPPHONE VARCHAR(20),"
                    + "PRIMARY KEY(COMPID))";

            Statement agent = conn.createStatement();
            agent.execute(CompanyQuery);

        } catch (SQLException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//
//Connection Con = null;
//Statement St = null ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MyProcess = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Pharmacy Management System");

        MyProcess.setForeground(new java.awt.Color(0, 153, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/icon.jpg"))); // NOI18N

        Percentage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Percentage.setForeground(new java.awt.Color(0, 153, 0));
        Percentage.setText("100%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MyProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 79, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(Percentage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Percentage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(MyProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        splash MySplash = new splash();
        MySplash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                MySplash.MyProcess.setValue(i);
                MySplash.Percentage.setText(Integer.toString(i) + "%");

            }
        } catch (Exception e) {
        }
        new Login().setVisible(true);
        MySplash.dispose();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

//               new Login().setVisible(true);
//        MySplash.dispose();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar MyProcess;
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
