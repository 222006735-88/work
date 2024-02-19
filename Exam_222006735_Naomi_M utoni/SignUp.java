
package login_signup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class SignUp extends javax.swing.JFrame {
    public SignUp() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpPanel = new javax.swing.JPanel();
        LoginH = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JTextField();
        Fname = new javax.swing.JLabel();
        Lnametxt = new javax.swing.JTextField();
        Fnametxt = new javax.swing.JTextField();
        Lname = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JPasswordField();
        SignUpbtn = new javax.swing.JButton();
        acctxt = new javax.swing.JLabel();
        Loginbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setPreferredSize(new java.awt.Dimension(600, 500));

        SignUpPanel.setBackground(new java.awt.Color(51, 204, 0));
        SignUpPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 153), new java.awt.Color(255, 255, 204)));
        SignUpPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        SignUpPanel.setPreferredSize(new java.awt.Dimension(600, 500));
        SignUpPanel.setLayout(null);

        LoginH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginH.setText("SIGN UP");
        SignUpPanel.add(LoginH);
        LoginH.setBounds(230, 20, 70, 40);

        Password.setText("Password");
        SignUpPanel.add(Password);
        Password.setBounds(90, 270, 130, 20);
        SignUpPanel.add(Usernametxt);
        Usernametxt.setBounds(90, 230, 340, 30);

        Fname.setText("First Name");
        SignUpPanel.add(Fname);
        Fname.setBounds(90, 70, 90, 16);
        SignUpPanel.add(Lnametxt);
        Lnametxt.setBounds(90, 160, 340, 30);
        SignUpPanel.add(Fnametxt);
        Fnametxt.setBounds(90, 90, 340, 30);

        Lname.setText("Last Name");
        SignUpPanel.add(Lname);
        Lname.setBounds(90, 130, 90, 16);

        Username.setText("Username");
        SignUpPanel.add(Username);
        Username.setBounds(90, 200, 90, 16);
        SignUpPanel.add(Passwordtxt);
        Passwordtxt.setBounds(90, 300, 340, 30);

        SignUpbtn.setBackground(new java.awt.Color(0, 102, 51));
        SignUpbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignUpbtn.setText("Sign Up");
        SignUpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpbtnActionPerformed(evt);
            }
        });
        SignUpPanel.add(SignUpbtn);
        SignUpbtn.setBounds(90, 350, 90, 40);

        acctxt.setText("I already have an account");
        SignUpPanel.add(acctxt);
        acctxt.setBounds(90, 410, 160, 16);

        Loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Loginbtn.setForeground(new java.awt.Color(255, 204, 153));
        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        SignUpPanel.add(Loginbtn);
        Loginbtn.setBounds(270, 390, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        SignUpPanel.getAccessibleContext().setAccessibleName("Sign Up");

        getAccessibleContext().setAccessibleName("SignUp");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        Login LoginFrame = new Login ();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void SignUpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpbtnActionPerformed
        // System.out.println("Sign Up button clicked!");
        String Fname, Lname, Username, Password, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/registered_users";
        SUser = "root";
        SPass = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(Fnametxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Lnametxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Usernametxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else if("".equals(Passwordtxt.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);

            } else{
                Fname = Fnametxt.getText();
                Lname = Lnametxt.getText();
                Username = Usernametxt.getText();
                Password = Passwordtxt.getText();
                System.out.println(Password);

                query = "INSERT INTO users (Fname, Lname, Username, Password)" +
                "VALUES('"+Fname+"', '"+Lname+"', '"+Username+"', '"+Password+"')";

                st.execute(query);
                Fnametxt.setText("");
                Lnametxt.setText("");
                Usernametxt.setText("");
                Passwordtxt.setText("");
                showMessageDialog(null, "New account has been created successfully!");

                Login LoginFrame = new Login ();
                LoginFrame.setVisible(true);
                LoginFrame.pack();
                LoginFrame.setLocationRelativeTo(null);
            }

        }catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_SignUpbtnActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fname;
    private javax.swing.JTextField Fnametxt;
    private javax.swing.JLabel Lname;
    private javax.swing.JTextField Lnametxt;
    private javax.swing.JLabel LoginH;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JButton SignUpbtn;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel acctxt;
    // End of variables declaration//GEN-END:variables
}
