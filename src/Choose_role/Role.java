/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Choose_role;

import Login.Admin_Login;
import Login.Stud_Login;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Role extends javax.swing.JFrame {

    public Role() {
        initComponents();
        //Making Constructor for Logo
        Image icon = new ImageIcon(getClass().getResource("/resources/icon.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        select_user = new javax.swing.JLabel();
        one_team_one_goal = new javax.swing.JLabel();
        btn_admin = new javax.swing.JButton();
        btn_student = new javax.swing.JButton();
        OTOG = new javax.swing.JLabel();
        whiteline1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OTOG");
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 59, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(1810, 860));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select_user.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        select_user.setForeground(new java.awt.Color(255, 255, 255));
        select_user.setText("Select User Role");
        jPanel1.add(select_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

        one_team_one_goal.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        one_team_one_goal.setForeground(new java.awt.Color(255, 255, 255));
        one_team_one_goal.setText("One Team One Goal");
        jPanel1.add(one_team_one_goal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        btn_admin.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        btn_admin.setText("Admin");
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });
        jPanel1.add(btn_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 220, -1));

        btn_student.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        btn_student.setText("Student");
        btn_student.setToolTipText("");
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });
        jPanel1.add(btn_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 220, -1));

        OTOG.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        OTOG.setForeground(new java.awt.Color(255, 255, 255));
        OTOG.setText("(OTOG)");
        jPanel1.add(OTOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        whiteline1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/White_line.jpg"))); // NOI18N
        jPanel1.add(whiteline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -120, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background_line.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 880));

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1256, 809));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        //hide role frame
        this.setVisible(false);
        //Show the login panel when clicked
        new Admin_Login().setVisible(true);
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        //hide role frame
        this.setVisible(false);
        //Show the login panel when clicked
        new Stud_Login().setVisible(true);
    }//GEN-LAST:event_btn_studentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Role.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Role().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OTOG;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_student;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel one_team_one_goal;
    private javax.swing.JLabel select_user;
    private javax.swing.JLabel whiteline1;
    // End of variables declaration//GEN-END:variables
}
