package welcome_scrn;

import Choose_role.Role;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class splashForm extends javax.swing.JFrame {

    public splashForm() {
        initComponents();
        
        //Constructor for Logo
        Image icon = new ImageIcon(getClass().getResource("/resources/icon.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        otog = new javax.swing.JLabel();
        one_team_one_goal = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        whiteline = new javax.swing.JLabel();
        background_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OTOG");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1116, 540));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1116, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 59, 119));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        otog.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        otog.setForeground(new java.awt.Color(255, 255, 255));
        otog.setText("(OTOG)");
        jPanel1.add(otog, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));
        otog.getAccessibleContext().setAccessibleParent(otog);

        one_team_one_goal.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        one_team_one_goal.setForeground(new java.awt.Color(255, 255, 255));
        one_team_one_goal.setText("One Team One Goal");
        jPanel1.add(one_team_one_goal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        ProgressBar.setToolTipText("");
        ProgressBar.setStringPainted(true);
        jPanel1.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 1270, 40));

        whiteline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/White_line.jpg"))); // NOI18N
        jPanel1.add(whiteline, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        background_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background_line.jpg"))); // NOI18N
        jPanel1.add(background_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1820, 860));

        setSize(new java.awt.Dimension(1240, 850));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Instantiation for splashForm
        final splashForm sf = new splashForm();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                //True - show splash screen
                sf.setVisible(true);
            }
        });
        
        Thread t = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                 //Loop for Progression Bar
                for (int i = 0; i <= 100; i++){
                    
                    try {
                        sf.ProgressBar.setValue(i);
                        Thread.sleep(40);
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                //making instance for role to be visible
                new Role().setVisible(true);
                //making splash screen disappear once role is shown
                sf.setVisible(false);
                
            }
        });
        t.start();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel background_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel one_team_one_goal;
    private javax.swing.JLabel otog;
    private javax.swing.JLabel whiteline;
    // End of variables declaration//GEN-END:variables
}
