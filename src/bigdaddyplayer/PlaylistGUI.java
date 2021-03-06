/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdaddyplayer;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author root
 */
public class PlaylistGUI extends javax.swing.JFrame {
    DbSave pl1 = new DbSave();
    String pname = null;
    /**
     * Creates new form PlaylistGUI
     */
    public PlaylistGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        plname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        list1 = new java.awt.List();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Pcombo = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        list2 = new java.awt.List();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Playlist");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plnameActionPerformed(evt);
            }
        });
        jPanel4.add(plname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 200, 40));

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Playlist Name");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        jButton2.setText("Create Playlist");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 347, 150, 30));

        jButton3.setText("Save");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jButton1.setText("Add Song");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, 70));

        list1.setBackground(new java.awt.Color(204, 204, 204));
        list1.setMultipleMode(true);
        list1.setName(""); // NOI18N
        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        jPanel4.add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 200));

        jPanel2.add(jPanel4, "card3");

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Select Playlist");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 40));

        Pcombo.setEditable(true);
        jPanel3.add(Pcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 30));

        jButton7.setText("Save");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 347, 150, 30));

        jButton6.setText("Add Song");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 147, 90, 80));

        list2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(list2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 210));

        jPanel2.add(jPanel3, "card2");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 420));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Create New");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 50, 40));

        jButton5.setText("Modify Old");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bigdaddyplayer/images/background_white_by_themrsnowman13-d4h17rj.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File myfile=chooser.getSelectedFile();
            String path = myfile + "";
            String filename = chooser.getSelectedFile().getName();
            //jList1.add(this,path);
            //String pname=plname.getText() + "";
            if (pname==null){
                plname.setText("Save Playlist first");
                return;
            }
            String sname = pl1.set_Playlist(path, pname);
            if (sname == null){
                        list1.add(filename);
                    }
            else{
                list1.add(sname);
            }
    }//GEN-LAST:event_jButton1MouseClicked
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        pname=plname.getText() + "";
        pl1.plsave(pname);
    }//GEN-LAST:event_jButton3MouseClicked

    private void plnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plnameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        //adding panel 4
        jPanel2.add(jPanel4);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();
        //adding panel 4
        jPanel2.add(jPanel3);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        //for drop down menu
        String[] pla = new String[100];
        pla = pl1.get_pname();
        /*for (int i=0; pla[i]=="eof"; i++){
            System.out.println(pla[i]);
            Pcombo.addItem(pla[i]);
        }*/
        int i=0;
        while (pla[i] != "eof"){
            Pcombo.addItem(pla[i]);
            i=i+1;
        }
        
        //Pcombo.addItem("test123");
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        
    }//GEN-LAST:event_list1ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File myfile=chooser.getSelectedFile();
            String path = myfile + "";
            String filename = chooser.getSelectedFile().getName();
            pname = Pcombo.getSelectedItem() + "";
            
            String sname = pl1.set_Playlist(path, pname);
            if (sname == null){
                        list1.add(filename);
                    }
            else{
                list1.add(sname);
            }
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //System.exit(0);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked
        

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
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Pcombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.List list1;
    private java.awt.List list2;
    private javax.swing.JTextField plname;
    // End of variables declaration//GEN-END:variables
}
